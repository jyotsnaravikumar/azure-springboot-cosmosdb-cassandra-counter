## Java Spring boot reference sample to show usage of CosmosDB Cassandra counters using spring-boot-starter-data-cassandra

## Steps to run the App
git clone https://github.com/jyotsnaravikumar/azure-springboot-cosmosdb-cassandra-counter.git </br>  
cd azure-springboot-cosmosdb-cassandra-counter </br>  
mvn clean install  </br>  
mvn clean spring-boot:run  </br>  

## Steps to test
### GET </br>  
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/coupons </br>  

## POST new record  </br>  
curl -X POST -H "Content-Type: application/json" -d '{"name" : "microsoft01","user" : "jr01"}' http://localhost:8080/coupons </br>  
## POST counter record  </br>  
curl -X POST -H "Content-Type: application/json" -d '{"id": "ec514720-ae7f-11e9-9caf-1bd76ed297da","name" : "microsoft3","user" : "jr3"}' http://localhost:8080/coupons </br>  
