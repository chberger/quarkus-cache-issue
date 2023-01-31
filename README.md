# quarkus-cache-issue

How to reproduce the issue?

```
mvn package -Pnative -Dquarkus.native.container-build=true
docker run -p 8080:8080 chberger/quarkus-cache-issue:1.0.0-SNAPSHOT
```

When compiling the code in ``JVM`` mode, everything should work:

```
mvn package
docker run -p 8080:8080 chberger/quarkus-cache-issue:1.0.0-SNAPSHOT
```

The same is true when using Quarkus ``2.15.3.Final``.

The issue is somehow related to the following cache configurations:

```
quarkus.cache.caffeine."test".expire-after-write=60M
quarkus.cache.caffeine."test".metrics-enabled=true
```

Without these configs in place, the code works again....
