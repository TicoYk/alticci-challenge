# Altice Challenge Project

This project uses Quarkus a Java Framework.

## Requirements
- Java 11+ (Project uses 17)
- Maven
- Docker (If you want to use docker)

## Running the application in dev mode

You can run this application using these commands on the project folder:

```shell script
./mvnw compile quarkus:dev
```
or if you want to use docker

```shell script
./mvnw package
docker compose up
```

After everything is running, you can access the app on [localhost:8080](http://localhost:8080)

## The algorithm solution

You can access through this link **[/alticci/10](http://localhost:8080/alticci/10)**

## Where is swagger?

You can download the file on [/swagger](http://localhost:8080/swagger) or you can visit the Swagger UI on [/swagger-ui](http://localhost:8080/swagger-ui)

## Where is the caching being made?

The caching is being use right on the calculation, even tough it's only a sum, we could use it for a more complex calculation.

It uses it's parameteres as keys and save it on the cache area **algo-util-calculation-sum**.
![cacheamento](https://user-images.githubusercontent.com/70176731/193933915-1c9b1bd7-1cb6-4789-85f0-1bb7cbd10e49.png)
