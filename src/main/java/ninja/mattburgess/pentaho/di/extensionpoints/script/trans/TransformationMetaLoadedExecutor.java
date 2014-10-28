package ninja.mattburgess.pentaho.di.extensionpoints.script.trans;

import ninja.mattburgess.pentaho.di.extensionpoints.script.BaseExtensionPointExecutor;
import org.pentaho.di.core.extension.ExtensionPoint;

@ExtensionPoint(
  id = "TransformationMetaLoadedScript",
  extensionPointId = "TransformationMetaLoaded",
  description = "Executes script(s) when transformation metadata is loaded"
)
public class TransformationMetaLoadedExecutor extends BaseExtensionPointExecutor {

  public TransformationMetaLoadedExecutor() {
    super( "TransformationMetaLoaded" );
  }
}
