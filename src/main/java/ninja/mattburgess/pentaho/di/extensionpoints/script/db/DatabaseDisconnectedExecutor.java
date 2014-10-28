package ninja.mattburgess.pentaho.di.extensionpoints.script.db;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "DatabaseDisconnectedScript",
  extensionPointId = "DatabaseDisconnected",
  description = "Executes script(s) when a database connection is disconnected"
)
public class DatabaseDisconnectedExecutor extends BaseExtensionPointExecutor {

  public DatabaseDisconnectedExecutor() {
    super( "DatabaseDisconnected" );
  }
}
