# Immfly

Spring-Boot REST

To deploy the Spring microservice is like in any common project. 
Just have to be in the folder of the project, execute a cmd or bash with the following command: 

mvnw spring-boot:run

-------------------------------------------------------------------------------------------------

Redis DDBB

To deploy the Redis instance, i've added to the project a docker-compose.yml that you cand find in Immfly/immfly-redis.
Also there is a backup of the Redis database content called dump.rdb with 9 entries .
Importante: You need to be sure that the file dump.rdb is already in the directory that Redis will search before making
docker-compose up.

In Windows the path where Redis will search for the file is: 
        \\wsl$\docker-desktop-data\data\docker\volumes\immfly-redis_cache\dump.rdb
In linux should be:
         /var/lib/docker/volumes/immfly-redis_cache/_data

In any case you can check it by doploying the container one time and using the command docker-inspect to check the section
"Mounts" where you will see the path and then stop and delete it to redo the docker-compose up.

---------------------------------------

Api access

All request should be made by an authorized user, I created a simple user with rights to request

User: admin
Pass: test1234

You need to pass user/pass as Basic Auth params in the headers in order to be authorized, once the 
cookie is created (In Postman, for example) you don't need to pass it again.


---------------------------------------

Api requests

The API only have one endpoint that could receive 1 or 2 params:

/v1/flight-information/{tail-number}/{flight-number}) 

You can request for all flights related to a tail number 
Or can request all information about a flight by passing the tail number and the flight number.

In the folder Immfly/immfly-redis you will find a JSON file with all the entries that are in the redis ddbb. You can consult any of these tail numbers or flight numbers.

 

