package ninja.mattburgess.pentaho.di.extensionpoints.script.job;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobFinishScript",
  extensionPointId = "JobFinish",
  description = "Executes script(s) when a job is started"
)
public class JobFinishExecutor extends BaseExtensionPointExecutor {

  public JobFinishExecutor() {
    super( "JobFinish" );
  }
}
