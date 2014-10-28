package ninja.mattburgess.pentaho.di.extensionpoints.script.trans;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransformationFinishScript",
  extensionPointId = "TransformationFinish",
  description = "Executes script(s) when transformations are finished"
)
public class TransformationFinishExecutor extends BaseExtensionPointExecutor {

  public TransformationFinishExecutor() {
    super( "TransformationFinish" );
  }
}
