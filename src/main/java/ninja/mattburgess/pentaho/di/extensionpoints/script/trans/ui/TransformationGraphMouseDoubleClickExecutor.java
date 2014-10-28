package ninja.mattburgess.pentaho.di.extensionpoints.script.trans.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransGraphMouseDoubleClickScript",
  extensionPointId = "TransGraphMouseDoubleClick",
  description = "Executes script(s) when a mouse button is double-clicked on a transformation canvas"
)
public class TransformationGraphMouseDoubleClickExecutor extends BaseExtensionPointExecutor {

  public TransformationGraphMouseDoubleClickExecutor() {
    super( "TransGraphMouseDoubleClick" );
  }
}
