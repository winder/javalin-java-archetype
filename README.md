# Javalin archetype to setup a project using Java.

Creates a simple [Javalin](https://javalin.io/tutorials/maven-setup) project to get you started quickly.

### Generate a new project

```bash
mvn archetype:generate -DarchetypeGroupId=com.willwinder \
  -DarchetypeArtifactId=javalin-java-archetype \
  -DarchetypeVersion=1.0.2
```

### Run the application

```bash
mvn package
java -jar target/<artifactId>*.jar
```
