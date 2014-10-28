package ninja.mattburgess.pentaho.di.extensionpoints.script.trans.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransformationPainterArrowScript",
  extensionPointId = "TransPainterArrow",
  description = "Executes script(s) when a hop arrow is being painted"
)
public class TransformationPainterArrowExecutor extends BaseExtensionPointExecutor {

  public TransformationPainterArrowExecutor() {
    super( "TransPainterArrow" );
  }
}
