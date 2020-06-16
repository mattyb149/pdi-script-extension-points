package ninja.mattburgess.pentaho.di.extensionpoints.script.job;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobBeforeSaveScript",
  extensionPointId = "JobBeforeSave",
  description = "Executes script(s) when a job is saved"
)
public class JobBeforeSaveExecutor extends BaseExtensionPointExecutor {

  public JobBeforeSaveExecutor() {
    super( "JobBeforeSave" );
  }
}
