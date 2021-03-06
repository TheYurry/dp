#! /bin/bash

fuser -k 7777/tcp
fuser -k 8080/tcp
fuser -k 8081/tcp
fuser -k 8082/tcp
fuser -k 8083/tcp
fuser -k 8088/tcp


./gradlew -b ./eureka/build.gradle --no-daemon bootrun &
sleep 5
./gradlew -b ./authorization/build.gradle --no-daemon bootrun &
sleep 5
./gradlew -b ./gateway/build.gradle --no-daemon  bootrun &
sleep 5
./gradlew -b ./generator/build.gradle --no-daemon  bootrun &
