package ninja.mattburgess.pentaho.di.extensionpoints.script.job.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobGraphJobEntrySetMenuScript",
  extensionPointId = "JobGraphJobEntrySetMenu",
  description = "Executes script(s) to manipulate the menu on right-click on a job entry"
)
public class JobGraphJobEntrySetMenuExecutor extends BaseExtensionPointExecutor {

  public JobGraphJobEntrySetMenuExecutor() {
    super( "JobGraphJobEntrySetMenu" );
  }
}
