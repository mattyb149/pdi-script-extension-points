package ninja.mattburgess.pentaho.di.extensionpoints.script;

import javax.script.Bindings;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

/**
 * Created by mburgess on 10/27/14.
 */
public class Script {

  String scriptText;
  ScriptEngine scriptEngine;
  CompiledScript compiledScript;
  Bindings bindings;

  public Script( ScriptEngine scriptEngine ) {
    this.scriptEngine = scriptEngine;
  }

  public Script( ScriptEngine scriptEngine, String scriptText ) {
    this( scriptEngine );
    this.scriptText = scriptText;
  }

  public Script( CompiledScript compiledScript ) {
    this( compiledScript.getEngine() );
    this.compiledScript = compiledScript;
  }

  public String getScriptText() {
    return scriptText;
  }

  public void setScriptText( String scriptText ) {
    this.scriptText = scriptText;
  }

  public ScriptEngine getScriptEngine() {
    return scriptEngine;
  }

  public void setScriptEngine( ScriptEngine scriptEngine ) {
    this.scriptEngine = scriptEngine;
  }

  public CompiledScript getCompiledScript() {
    return compiledScript;
  }

  public void setCompiledScript( CompiledScript compiledScript ) {
    this.compiledScript = compiledScript;
    this.scriptEngine = compiledScript.getEngine();
  }

  public void eval() throws ScriptException {
    if ( compiledScript != null ) {
      compiledScript.eval( bindings );
    } else if ( scriptText != null ) {
      if ( scriptEngine != null ) {
        scriptEngine.eval( scriptText, bindings );
      } else {
        throw new ScriptException( "No script engine selected!" );
      }
    } else {
      throw new ScriptException( "No script engine selected!" );
    }
  }

  public Bindings getBindings() {
    return bindings;
  }

  public void setBindings( Bindings bindings ) {
    this.bindings = bindings;
  }
}
