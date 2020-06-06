# Producer Sample for Kafkaesque 
A sample Java producer using the Apache Pulsar client API to connect to a Kafkaesque service. The project builds with Maven.

## Build and test


### Tested Environment
- CentOS 7

- maven 3.6.2

- Oracle Java version 1.8.0_222 (recommended)

- Open JDK
openjdk 11.0.5 2019-10-15 LTS
OpenJDK Runtime Environment 18.9 (build 11.0.5+10-LTS)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.5+10-LTS, mixed mode, sharing)

### Steps to build a jar and test

1. Replace SERVICE_URL, TOKE_STRING, TOPIC in simpleProducer.java

2. Compile and Build a jar with all dependencies
```
$ mvn clean compile assembly:single

```

3. Run a test producer 
```
$ java -cp target/java-producer-1.0-SNAPSHOT-jar-with-dependencies.jar io.kafkaesque.simpleProducer
```