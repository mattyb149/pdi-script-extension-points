package ninja.mattburgess.pentaho.di.extensionpoints.script.job;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobStartScript",
  extensionPointId = "JobStart",
  description = "Executes script(s) when a job is started"
)
public class JobStartExecutor extends BaseExtensionPointExecutor {

  public JobStartExecutor() {
    super( "JobStart" );
  }
}
