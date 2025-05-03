FROM eclipse-temurin:11-jdk AS build

WORKDIR /app

# Copiar los archivos del proyecto
COPY pom.xml .
COPY src ./src

# Construir la aplicación
RUN mvn clean package

# Imagen de ejecución
FROM eclipse-temurin:11-jre

WORKDIR /app

# Copiar el archivo JAR compilado
COPY --from=build /app/target/calculator-1.0-SNAPSHOT.jar ./app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]