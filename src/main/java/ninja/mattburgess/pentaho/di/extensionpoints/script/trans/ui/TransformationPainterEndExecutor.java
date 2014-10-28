package ninja.mattburgess.pentaho.di.extensionpoints.script.trans.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransformationPainterEndScript",
  extensionPointId = "TransPainterEnd",
  description = "Executes script(s) when a transformation is done being painted"
)
public class TransformationPainterEndExecutor extends BaseExtensionPointExecutor {

  public TransformationPainterEndExecutor() {
    super( "TransPainterEnd" );
  }
}
