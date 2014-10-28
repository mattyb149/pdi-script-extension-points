package ninja.mattburgess.pentaho.di.extensionpoints.script.job;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobBeginProcessingScript",
  extensionPointId = "JobBeginProcessing",
  description = "Executes script(s) when a job is started after log table handling"
)
public class JobBeginProcessingExecutor extends BaseExtensionPointExecutor {

  public JobBeginProcessingExecutor() {
    super( "JobBeginProcessing" );
  }
}
