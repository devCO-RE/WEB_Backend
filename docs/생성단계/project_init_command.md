# microservices 구조 생성

1. 개별 서비스 프로젝트 생성

```
spring init \
--boot-version=2.3.4.RELEASE \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=user-service \
--package-name=com.core.microservices.core.user \
--groupId=com.core.microservices.core.user \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
user-service
```

```
spring init \
--boot-version=2.3.4.RELEASE \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=material-service \
--package-name=com.core.microservices.core.material \
--groupId=com.core.microservices.core.material \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
material-service

```

2. 복합 서비스 프로젝트 생성

```
spring init \
--boot-version=2.3.4.RELEASE \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=user-composite-service \
--package-name=com.core.microservices.composite.user \
--groupId=com.core.microservices.composite.user \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
user-composite-service

```
