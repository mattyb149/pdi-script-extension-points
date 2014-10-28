package ninja.mattburgess.pentaho.di.extensionpoints.script.job.entry;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobAfterJobEntryExecutionScript",
  extensionPointId = "JobAfterJobEntryExecution",
  description = "Executes script(s) after a job entry is executed"
)
public class JobAfterJobEntryExecutor extends BaseExtensionPointExecutor {

  public JobAfterJobEntryExecutor() {
    super( "JobAfterJobEntryExecution" );
  }
}
