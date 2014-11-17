package ninja.mattburgess.pentaho.di.extensionpoints.script.lifecycle;

import ninja.mattburgess.pentaho.di.extensionpoints.script.PluginScriptUtil;
import org.pentaho.di.core.annotations.KettleLifecyclePlugin;
import org.pentaho.di.core.lifecycle.KettleLifecycleListener;
import org.pentaho.di.core.lifecycle.LifecycleException;

import javax.script.Bindings;
import javax.script.SimpleBindings;

/**
 * Created by mburgess on 11/17/14.
 */
@KettleLifecyclePlugin(
  id = "kettleLifecycleScriptExecutor",
  name="Kettle Lifecycle Script Executor"
)
public class KettleLifecycleScriptExecutor implements KettleLifecycleListener {

  public static final String KETTLE_LIFECYCLE_ENVINIT_PREFIX = "environmentInit";
  public static final String KETTLE_LIFECYCLE_ENVSHUTDOWN_PREFIX = "environmentShutdown";

  protected PluginScriptUtil scriptUtil = new PluginScriptUtil();

  @Override
  public void onEnvironmentInit() throws LifecycleException {
    Bindings b = new SimpleBindings();
    try {
      scriptUtil.loadScripts( KETTLE_LIFECYCLE_ENVINIT_PREFIX );
      scriptUtil.runScripts( b );
    }
    catch(Exception e) {
      throw new LifecycleException( "Error executing environmentInit script", e, true );
    }
  }

  @Override
  public void onEnvironmentShutdown() {
    Bindings b = new SimpleBindings();
    try {
      scriptUtil.loadScripts( KETTLE_LIFECYCLE_ENVSHUTDOWN_PREFIX );
      scriptUtil.runScripts( b );
    }
    catch(Exception e) {
      // Can't do much here
    }
  }
}
