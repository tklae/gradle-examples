# gradle-examples

Collection of common gradle patterns and example projects.

## Common tips
* If you run gradle often, make sure you use *gradle --daemon*. This will run a gradle daemon in the background and not spin up a new java/groovy vm for each gradle command. If you always want to use it, you can also create an alias: `alias gradle='gradle --daemon'`
*  For committing, I use the following alias: `alias gcommit='git pull --rebase && gradle build && git push'`
* If you want to force refresh of dependencies, use `gradle refresh-dependencies`
  
## Example overview
1. [How to generate a new project quickly](/generateNewProject/build.gradle)
2. Simple common setup, see [build.gradle](./build.gradle)
3. Adding behaviour to certain stages, for example [extended output when running tests](./extendedTestOutput/build.gradle)
4. Playing around with [strict dependency management](./dependencyManagement/build.gradle)
5. Building a [small library uploadable to some repository](./uploadLibrary/build.gradle)
6. Multi project setup using [parent build.gradle](multiModuleBuildUsingParentBuildFile/build.gradle) and [settings.gradle](multiModuleBuildUsingParentBuildFile/settings.gradle)
7. Including shared fragments using apply-from (if you don't want your projects within one giant git repository). Note that dependencies other than those defined via a central repository do not work this way.
    Useful links are
    * [here](http://www.gradle.org/docs/current/userguide/tutorial_this_and_that.html),
    * [here](https://stackoverflow.com/questions/18715137/extract-common-methods-from-gradle-build-script) and
    * [here](http://forums.gradle.org/gradle/topics/usage_of_apply_from_in_buildscript_scope).

## My setup
Just for completeness, this is what I'm using for these examples:
* MacBook Pro/OSX Mavericks
* Git as VCS
* Java 1.7 for example code
* Gradle 1.9 (all examples should work with any version >= 1.8)
* IntelliJ Idea 13 Ultimate (all examples should work with any version >= 11)
