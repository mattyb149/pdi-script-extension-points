package ninja.mattburgess.pentaho.di.extensionpoints.script.job.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobDialogShowRetrieveLogTableFieldsScript",
  extensionPointId = "JobDialogShowRetrieveLogTableFields",
  description = "Executes script(s) when retrieving the contents of the log channel fields on its composite"
)
public class JobDialogShowRetrieveLogTableFieldsExecutor extends BaseExtensionPointExecutor {

  public JobDialogShowRetrieveLogTableFieldsExecutor() {
    super( "JobDialogShowRetrieveLogTableFields" );
  }
}
