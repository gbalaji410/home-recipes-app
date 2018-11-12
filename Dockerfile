FROM openjdk:8-jdk-alpine

LABEL maintainer="balaji2104@gmail.com"

ENV JAVA_VERSION 8u31
ENV BUILD_VERSION b13
 
# Upgrading system
#RUN yum -y upgrade
#RUN yum -y install wget
 
# Downloading & Config Java 8
#RUN wget --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/$JAVA_VERSION-$BUILD_VERSION/jdk-$JAVA_VERSION-linux-x64.rpm" -O /tmp/jdk-8-linux-x64.rpm
#RUN yum -y install /tmp/jdk-8-linux-x64.rpm
#RUN alternatives --install /usr/bin/java jar /usr/java/latest/bin/java 200000
#RUN alternatives --install /usr/bin/javaws javaws /usr/java/latest/bin/javaws 200000
#RUN alternatives --install /usr/bin/javac javac /usr/java/latest/bin/javac 200000

EXPOSE 8080

#install Spring Boot artifact
VOLUME /app
ADD target/home-recipes-app-1.0.0-SNAPSHOT.jar homerecipes.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/homerecipes.jar"]