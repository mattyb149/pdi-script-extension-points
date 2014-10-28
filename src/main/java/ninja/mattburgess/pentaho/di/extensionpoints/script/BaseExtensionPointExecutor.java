package ninja.mattburgess.pentaho.di.extensionpoints.script;

import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.extension.ExtensionPointInterface;
import org.pentaho.di.core.logging.LogChannelInterface;

import javax.script.Bindings;
import javax.script.SimpleBindings;

/**
 * Created by mburgess on 10/28/14.
 */
public abstract class BaseExtensionPointExecutor implements ExtensionPointInterface {

  protected ExtensionPointScriptUtil scriptUtil = new ExtensionPointScriptUtil();

  public BaseExtensionPointExecutor( String extensionPointId ) {
    scriptUtil.loadScripts( extensionPointId );
  }

  @Override
  public void callExtensionPoint( LogChannelInterface logChannelInterface, Object o ) throws KettleException {
    Bindings b = new SimpleBindings();
    b.put( "_log_", logChannelInterface );
    b.put( "_object_", o );
    try {
      scriptUtil.runScripts( b );
    }
    catch(Exception e) {
      logChannelInterface.logError( "Error executing extension point script", e );
    }
  }
}
