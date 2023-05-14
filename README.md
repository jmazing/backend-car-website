## Steps to run application:
1. Run eureka-server application:
    - cd into eureka-server directory
    - mvn clean package -Dmaven.test.skip
    - java -jar target/eureka-server-0.0.1-SNAPSHOT.jar
2. Run boogle-maps application:
    - cd into boogle-mapsdirectory
    - mvn clean package -Dmaven.test.skip
    - java -jar target/boogle-maps-0.0.1-SNAPSHOT.jar
3. Run pricing-service application:
    - cd into pricing-service directory
    - mvn clean package -Dmaven.test.skip
    - java -jar target/pricing-service-0.0.1-SNAPSHOT.jar
4. Run vehicles-api application:
    - cd into vehicles-api directory
    - mvn clean package -Dmaven.test.skip
    - java -jar target/vehicles-api-0.0.1-SNAPSHOT.jar

## Curl Vehicles-API
Once the all the applications are up and running perform CRUD operations against the vehicle-api.
Visit the swagger page located here: http://localhost:8080/swagger-ui.html. You can also look
at the Vehicles-API README for more information.
