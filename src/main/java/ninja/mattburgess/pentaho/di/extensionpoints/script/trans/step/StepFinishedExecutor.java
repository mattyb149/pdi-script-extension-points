package ninja.mattburgess.pentaho.di.extensionpoints.script.trans.step;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "StepFinishedScript",
  extensionPointId = "StepFinished",
  description = "Executes script(s) after a step is finished"
)
public class StepFinishedExecutor extends BaseExtensionPointExecutor {

  public StepFinishedExecutor() {
    super( "StepFinished" );
  }
}
