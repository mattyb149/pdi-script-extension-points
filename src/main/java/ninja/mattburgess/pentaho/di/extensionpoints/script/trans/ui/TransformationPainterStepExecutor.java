package ninja.mattburgess.pentaho.di.extensionpoints.script.trans.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransformationPainterStepScript",
  extensionPointId = "TransPainterStep",
  description = "Executes script(s) when a step is being painted"
)
public class TransformationPainterStepExecutor extends BaseExtensionPointExecutor {

  public TransformationPainterStepExecutor() {
    super( "TransPainterStep" );
  }
}
