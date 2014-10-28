package ninja.mattburgess.pentaho.di.extensionpoints.script.trans;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransformationStartScript",
  extensionPointId = "TransformationStart",
  description = "Executes script(s) when transformations are started"
)
public class TransformationStartExecutor extends BaseExtensionPointExecutor {

  public TransformationStartExecutor() {
    super( "TransformationStart" );
  }
}
