# Microservice application with spring boot 

## Create more instances of UserService microservice
Jump into the microservice repo
```
cd cd Spring-boot\openFeign\UsersService 
```
choose the name of instance and the associated port in the arguments
```
mvn spring-boot:run -Dspring-boot.run.arguments="--spring.applcation.instance_id=instance1 --server.port=9000"
```
