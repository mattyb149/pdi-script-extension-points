package ninja.mattburgess.pentaho.di.extensionpoints.script.job.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobPainterEndScript",
  extensionPointId = "JobPainterEnd",
  description = "Executes script(s) when a job is done being painted"
)
public class JobPainterEndExecutor extends BaseExtensionPointExecutor {

  public JobPainterEndExecutor() {
    super( "JobPainterEnd" );
  }
}
