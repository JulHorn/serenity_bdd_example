# Serenity Example
A simple Serenity BDD example project I created to make myself more familiar with the framework.
The example project uses JUnit to do the testing stuff. It is possible to do more with Serenity than this project does
like using JBehave or the Screenplay pattern.

## Using this Project

In order to use the example project, simply import it as Gradle project into your favorite IDE.
You can run the tests directly via the IDE or the Gradle "test" task. The test report can be created via the "aggregate"
task. It can be found in the "target" folder as "index.html". Simply open the file in a browser.

## Project Structure

The project is structured as followed:

1. The "serenity.properties" file in the root folder contains options like the base URL or when screenshots should be taken.
2. The Page Object classes are located in the "main/java/page" folder.
3. The step classes are located in the located in the "main/java/step" folder.
4. The JUnit tests are located in the "test/java/test" folder.