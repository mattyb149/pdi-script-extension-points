package ninja.mattburgess.pentaho.di.extensionpoints.script.trans;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransformationPrepareScript",
  extensionPointId = "TransformationPrepareExecution",
  description = "Executes script(s) when transformations are preparing for execution"
)
public class TransformationPrepareExecutor extends BaseExtensionPointExecutor {

  public TransformationPrepareExecutor() {
    super( "TransformationPrepareExecution" );
  }
}
