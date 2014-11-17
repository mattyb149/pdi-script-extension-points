pdi-script-extension-points ![travis-ci status](https://travis-ci.org/mattyb149/pdi-script-extension-points.svg?branch=master)
===========================

Description
--------------

This set of PDI extension point plugins allows the user to write scripts in:

- JavaScript
- Groovy
- AppleScript
- any other language that has a JSR-223 script engine

These scripts will be executed as the payload for various PDI extension points (http://wiki.pentaho.com/display/EAI/PDI+Extension+Point+Plugins)

Also support scripts for the following:

Kettle Lifecycle Plugins (use the following as prefixes for your script file names):
environmentInit
environmentShutdown

Lifecycle Plugins (use the following as prefixes for your script file names):
onStart
onExit



Compiling
--------------

Use the following to build the plugin package:

gradle clean plugin

Examples
--------------

The package comes with three examples located in the plugins/pdi-script-extension-points/ folder:
 - TransformationStart.groovy
 - TransformationFinish.js 
 - onStart.groovy

These are included to show that the two engines that come with PDI (Groovy and Rhino-JS, respectively) can be used to run scripts as execution point and/or lifecycle event methods.
