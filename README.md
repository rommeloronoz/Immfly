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

