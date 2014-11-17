package ninja.mattburgess.pentaho.di.extensionpoints.script.lifecycle;

import ninja.mattburgess.pentaho.di.extensionpoints.script.PluginScriptUtil;
import org.pentaho.di.core.annotations.LifecyclePlugin;
import org.pentaho.di.core.lifecycle.LifeEventHandler;
import org.pentaho.di.core.lifecycle.LifecycleException;
import org.pentaho.di.core.lifecycle.LifecycleListener;

import javax.script.Bindings;
import javax.script.SimpleBindings;

/**
 * Created by mburgess on 11/17/14.
 */
@LifecyclePlugin(
  id = "lifecycleScriptExecutor",
  name = "LifecycleScriptExecutor"
)
public class LifecycleScriptExecutor implements LifecycleListener {

  public static final String LIFECYCLE_ONSTART_PREFIX = "onStart";
  public static final String LIFECYCLE_ONEXIT_PREFIX = "onExit";

  protected PluginScriptUtil scriptUtil = new PluginScriptUtil();


  @Override
  public void onStart( LifeEventHandler lifeEventHandler ) throws LifecycleException {
    Bindings b = new SimpleBindings();
    b.put( "_handler_", lifeEventHandler );
    try {
      scriptUtil.loadScripts( LIFECYCLE_ONSTART_PREFIX );
      scriptUtil.runScripts( b );
    }
    catch(Exception e) {
      throw new LifecycleException( "Error executing onStart script", e, true );
    }
  }

  @Override
  public void onExit( LifeEventHandler lifeEventHandler ) throws LifecycleException {
    Bindings b = new SimpleBindings();
    b.put( "_handler_", lifeEventHandler );
    try {
      scriptUtil.loadScripts( LIFECYCLE_ONEXIT_PREFIX );
      scriptUtil.runScripts( b );
    }
    catch(Exception e) {
      throw new LifecycleException( "Error executing onExit script", e, true );
    }
  }
}
