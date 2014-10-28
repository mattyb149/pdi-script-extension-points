package ninja.mattburgess.pentaho.di.extensionpoints.script.job.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobPainterJobEntryScript",
  extensionPointId = "TransPainterJobEntry",
  description = "Executes script(s) when a job entry is being painted"
)
public class JobPainterJobEntryExecutor extends BaseExtensionPointExecutor {

  public JobPainterJobEntryExecutor() {
    super( "TransPainterJobEntry" );
  }
}
