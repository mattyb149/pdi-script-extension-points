pdi-script-extension-points
===========================

This set of PDI extension point plugins allows the user to write scripts in:

- JavaScript
- Groovy
- AppleScript
- any other language that has a JSR-223 script engine

These scripts will be executed as the payload for various PDI extension points (http://wiki.pentaho.com/display/EAI/PDI+Extension+Point+Plugins)

Use the following to build the plugin package:

gradle clean plugin

The package comes with two examples:
 - TransformationStart.groovy
 - TransformationFinish.js) 

These are included to show that the two engines that come with PDI (Groovy and Rhino-JS, respectively) can be used to run scripts as execution point methods.
