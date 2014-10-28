package ninja.mattburgess.pentaho.di.extensionpoints.script.trans.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransGraphMouseDownScript",
  extensionPointId = "TransGraphMouseDown",
  description = "Executes script(s) when a mouse button is depressed on a transformation canvas"
)
public class TransformationGraphMouseDownExecutor extends BaseExtensionPointExecutor {

  public TransformationGraphMouseDownExecutor() {
    super( "TransGraphMouseDown" );
  }
}
