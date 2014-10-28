package ninja.mattburgess.pentaho.di.extensionpoints.script.trans.step;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "StepBeforeInitializeScript",
  extensionPointId = "StepBeforeInitialize",
  description = "Executes script(s) before a step is initialized"
)
public class StepBeforeInitExecutor extends BaseExtensionPointExecutor {

  public StepBeforeInitExecutor() {
    super( "StepBeforeInitialize" );
  }
}
