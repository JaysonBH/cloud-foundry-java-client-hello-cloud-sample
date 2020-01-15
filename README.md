### cloud-foundry-java-client-hello-cloud-sample

This Sample application allows you to quickly test out the [Cloud Foundry Java Client](https://github.com/cloudfoundry/cf-java-client) on your local machine.

1. Clone the repository:
    
    ```
    git clone https://github.com/JaysonBH/cloud-foundry-java-client-hello-cloud-sample.git
    cd cloud-foundry-java-client-hello-cloud-sample
    ```

2. Set the below property values within the `application.properties` file or supply them via environment variables before running:

    ```
    cf.apiHost=api.YOUR_CLOUD_FOUNDRY_SYSTEM_DOMAIN
    cf.username=USER
    cf.password=PASSWORD
    ```
   
   Simple access:
   ```
   vi src/main/resources/application.properties
   ```

3. Build with Maven:
    
   ```
   ./mvnw package   
   ```

4. Run the application locally:
   ```
   java -jar target/cf-client-task-demo-1.0.0.jar
   ```

5. Observe the Output of your system.