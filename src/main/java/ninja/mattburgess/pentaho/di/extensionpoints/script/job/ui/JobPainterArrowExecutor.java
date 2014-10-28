package ninja.mattburgess.pentaho.di.extensionpoints.script.job.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobPainterArrowScript",
  extensionPointId = "JobPainterArrow",
  description = "Executes script(s) when a job entry hop arrow is being painted"
)
public class JobPainterArrowExecutor extends BaseExtensionPointExecutor {

  public JobPainterArrowExecutor() {
    super( "JobPainterArrow" );
  }
}
