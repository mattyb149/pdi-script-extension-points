package ninja.mattburgess.pentaho.di.extensionpoints.script.job.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobGraphMouseDoubleClickScript",
  extensionPointId = "JobGraphMouseDoubleClick",
  description = "Executes script(s) when a mouse button is double-clicked on a job canvas"
)
public class JobGraphMouseDoubleClickExecutor extends BaseExtensionPointExecutor {

  public JobGraphMouseDoubleClickExecutor() {
    super( "JobGraphMouseDoubleClick" );
  }
}
