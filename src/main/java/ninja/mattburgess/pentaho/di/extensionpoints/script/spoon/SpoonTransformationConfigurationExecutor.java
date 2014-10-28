package ninja.mattburgess.pentaho.di.extensionpoints.script.spoon;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "SpoonTransExecutionConfigurationScript",
  extensionPointId = "SpoonTransExecutionConfiguration",
  description = "Executes script(s) when Spoon configures a transformation execution"
)
public class SpoonTransformationConfigurationExecutor extends BaseExtensionPointExecutor {

  public SpoonTransformationConfigurationExecutor() {
    super( "SpoonTransExecutionConfiguration" );
  }
}
