package ninja.mattburgess.pentaho.di.extensionpoints.script.job.ui;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobGraphMouseDownScript",
  extensionPointId = "JobGraphMouseDown",
  description = "Executes script(s) when a mouse button is depressed on a job canvas"
)
public class JobGraphMouseDownExecutor extends BaseExtensionPointExecutor {

  public JobGraphMouseDownExecutor() {
    super( "JobGraphMouseDown" );
  }
}
