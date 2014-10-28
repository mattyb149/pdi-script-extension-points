package ninja.mattburgess.pentaho.di.extensionpoints.script.trans.step;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "StepBeforeStartScript",
  extensionPointId = "StepBeforeStart",
  description = "Executes script(s) before a step is started"
)
public class StepBeforeStartExecutor extends BaseExtensionPointExecutor {

  public StepBeforeStartExecutor() {
    super( "StepBeforeStart" );
  }
}
