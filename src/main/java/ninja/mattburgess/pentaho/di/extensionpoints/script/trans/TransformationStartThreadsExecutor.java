package ninja.mattburgess.pentaho.di.extensionpoints.script.trans;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransformationStartScript",
  extensionPointId = "TransformationStartThreads",
  description = "Executes script(s) when transformation step threads are started"
)
public class TransformationStartThreadsExecutor extends BaseExtensionPointExecutor {

  public TransformationStartThreadsExecutor() {
    super( "TransformationStartThreads" );
  }
}
