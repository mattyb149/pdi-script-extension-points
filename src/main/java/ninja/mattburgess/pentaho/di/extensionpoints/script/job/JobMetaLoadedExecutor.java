package ninja.mattburgess.pentaho.di.extensionpoints.script.job;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "JobMetaLoadedScript",
  extensionPointId = "JobMetaLoaded",
  description = "Executes script(s) when job metadata is loaded"
)
public class JobMetaLoadedExecutor extends BaseExtensionPointExecutor {

  public JobMetaLoadedExecutor() {
    super( "JobMetaLoaded" );
  }
}
