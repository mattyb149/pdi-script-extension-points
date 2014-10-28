package ninja.mattburgess.pentaho.di.extensionpoints.script.job.entry;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobBeforeJobEntryExecutionScript",
  extensionPointId = "JobBeforeJobEntryExecution",
  description = "Executes script(s) before a job entry is executed"
)
public class JobBeforeJobEntryExecutor extends BaseExtensionPointExecutor {

  public JobBeforeJobEntryExecutor() {
    super( "JobBeforeJobEntryExecution" );
  }
}
