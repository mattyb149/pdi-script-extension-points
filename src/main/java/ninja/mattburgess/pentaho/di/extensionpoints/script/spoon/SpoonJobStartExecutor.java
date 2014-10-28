package ninja.mattburgess.pentaho.di.extensionpoints.script.spoon;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "SpoonJobMetaExecutionStartScript",
  extensionPointId = "SpoonJobMetaExecutionStart",
  description = "Executes script(s) when Spoon starts a job"
)
public class SpoonJobStartExecutor extends BaseExtensionPointExecutor {

  public SpoonJobStartExecutor() {
    super( "SpoonJobMetaExecutionStart" );
  }
}
