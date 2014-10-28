package ninja.mattburgess.pentaho.di.extensionpoints.script.spoon;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "SpoonTransMetaExecutionStartScript",
  extensionPointId = "SpoonTransMetaExecutionStart",
  description = "Executes script(s) when Spoon starts a transformation"
)
public class SpoonTransformationStartExecutor extends BaseExtensionPointExecutor {

  public SpoonTransformationStartExecutor() {
    super( "SpoonTransMetaExecutionStart" );
  }
}
