package ninja.mattburgess.pentaho.di.extensionpoints.script.spoon;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "SpoonJobExecutionConfigurationScript",
  extensionPointId = "SpoonJobExecutionConfiguration",
  description = "Executes script(s) when Spoon configures a job execution"
)
public class SpoonJobConfigurationExecutor extends BaseExtensionPointExecutor {

  public SpoonJobConfigurationExecutor() {
    super( "SpoonJobExecutionConfiguration" );
  }
}
