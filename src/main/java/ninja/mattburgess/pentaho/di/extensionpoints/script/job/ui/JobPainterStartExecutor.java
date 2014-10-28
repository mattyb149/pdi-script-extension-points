package ninja.mattburgess.pentaho.di.extensionpoints.script.job.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobPainterStartScript",
  extensionPointId = "JobPainterStart",
  description = "Executes script(s) when a job is being painted"
)
public class JobPainterStartExecutor extends BaseExtensionPointExecutor {

  public JobPainterStartExecutor() {
    super( "JobPainterStart" );
  }
}
