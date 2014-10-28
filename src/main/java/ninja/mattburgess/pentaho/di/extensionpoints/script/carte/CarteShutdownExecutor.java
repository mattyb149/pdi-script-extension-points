package ninja.mattburgess.pentaho.di.extensionpoints.script.carte;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "CarteShutdownScript",
  extensionPointId = "CarteShutdown",
  description = "Executes script(s) when a Carte instance is shut down"
)
public class CarteShutdownExecutor extends BaseExtensionPointExecutor {

  public CarteShutdownExecutor() {
    super( "CarteShutdown" );
  }
}
