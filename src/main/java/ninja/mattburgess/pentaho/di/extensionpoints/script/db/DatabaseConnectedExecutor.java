package ninja.mattburgess.pentaho.di.extensionpoints.script.db;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "DatabaseConnectedScript",
  extensionPointId = "DatabaseConnected",
  description = "Executes script(s) when a database connection is made"
)
public class DatabaseConnectedExecutor extends BaseExtensionPointExecutor {

  public DatabaseConnectedExecutor() {
    super( "DatabaseConnected" );
  }
}
