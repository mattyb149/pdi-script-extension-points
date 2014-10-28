package ninja.mattburgess.pentaho.di.extensionpoints.script.trans.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransformationPainterStartScript",
  extensionPointId = "TransPainterStart",
  description = "Executes script(s) when a transformation is being painted"
)
public class TransformationPainterStartExecutor extends BaseExtensionPointExecutor {

  public TransformationPainterStartExecutor() {
    super( "TransPainterStart" );
  }
}
