FROM eclipse-temurin:21-jre

# Create '/opt/app' directory and 'cd /opt/app'
WORKDIR /opt/app

# Copy *.jar to '/opt/app' with renaming to 'app.jar'
COPY target/dockerTest.jar app.jar

EXPOSE 9091

ENTRYPOINT [ "java", "-jar", "app.jar" ]