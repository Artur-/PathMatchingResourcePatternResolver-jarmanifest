Example for problem with `PathMatchingResourcePatternResolver`

Test 1 - run as jar:

```
mvn install
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

Output will be

```
Searching for classpath*:**/component/Tag.class
URL [jar:file:/.../target/demo-0.0.1-SNAPSHOT.jar!/BOOT-INF/lib/flow-server-2.1.0.jar!/com/vaadin/flow/component/Tag.class]

Searching for classpath*:com/**/component/Tag.class
URL [jar:file:/.../target/demo-0.0.1-SNAPSHOT.jar!/BOOT-INF/lib/flow-server-2.1.0.jar!/com/vaadin/flow/component/Tag.class]
```

Test 2 - run the application class in VS Code

Output will be

```
Searching for classpath*:**/component/Tag.class

Searching for classpath*:com/**/component/Tag.class
URL [jar:file:/.../.m2/repository/com/vaadin/flow-server/2.1.0/flow-server-2.1.0.jar!/com/vaadin/flow/component/Tag.class]
```
