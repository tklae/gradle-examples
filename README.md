# gradle-examples

Collection of common gradle patterns and example projects.

## Common tips
* If you run gradle often, make sure you use *gradle --daemon*. This will run a gradle daemon in the background and not spin up a new java/groovy vm for each gradle command. If you always want to use it, you can also create an alias: `alias gradle='gradle --daemon'`
*  For committing, I use the following alias: `alias gcommit='git pull --rebase && gradle build && git push'`
  
## Example overview
1. How to generate a new project quickly
2. Simple common setup
3. Adding behaviour to certain stages
4. Playing around with strict dependency management
5. Building a small library uploadable to some repository
6. Multi project setup using parent build.gradle
7. Multi project setup using apply-from (if you don't want your projects within one giant git repository)

## My setup
Just for completeness, this is what I'm using for these examples:
* MacBook Pro/OSX Mavericks
* Java 1.7 for example code
* Gradle 1.9 (all examples should work with any version >= 1.8)
* IntelliJ Idea 13 Ultimate (all examples should work with any version >= 11)
