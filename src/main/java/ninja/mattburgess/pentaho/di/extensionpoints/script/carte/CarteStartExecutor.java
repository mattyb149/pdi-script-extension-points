package ninja.mattburgess.pentaho.di.extensionpoints.script.carte;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "CarteStartupScript",
  extensionPointId = "CarteStartup",
  description = "Executes script(s) when a Carte instance is started"
)
public class CarteStartExecutor extends BaseExtensionPointExecutor {

  public CarteStartExecutor() {
    super( "CarteStartup" );
  }
}
