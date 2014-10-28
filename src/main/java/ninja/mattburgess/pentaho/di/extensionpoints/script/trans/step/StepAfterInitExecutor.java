package ninja.mattburgess.pentaho.di.extensionpoints.script.trans.step;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "StepAfterInitializeScript",
  extensionPointId = "StepAfterInitialize",
  description = "Executes script(s) after a step is initialized"
)
public class StepAfterInitExecutor extends BaseExtensionPointExecutor {

  public StepAfterInitExecutor() {
    super( "StepAfterInitialize" );
  }
}
