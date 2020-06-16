package ninja.mattburgess.pentaho.di.extensionpoints.script.trans;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransBeforeSaveScript",
  extensionPointId = "TransBeforeSave",
  description = "Executes script(s) when transformations are saved"
)
public class TransBeforeSaveExecutor extends BaseExtensionPointExecutor {

  public TransBeforeSaveExecutor() {
    super( "TransBeforeSave" );
  }
}
