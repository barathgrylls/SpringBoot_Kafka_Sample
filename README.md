# SpringBoot_Kafka_Sample

#kakfka setup in local


1. download kafka in your system
2. extract and check the folders
3. Verify following two in config folder
	zookeeper.properties
	server.properties
4. create "data" folder in "C:\kafka_2.12-2.8.0" location
5. create two folder inside the "data" one is for zookeeper(zookeeper folder) and other for kafkaserver(kakfaserver folder)
6. open zookeeper.properties and edit  dataDir=C:/kafka_2.12-2.8.0/data/zookeeper
7. open server.properties and edit log.dirs=C:/kafka_2.12-2.8.0/data/kafkabroker
8. start the zookeeper //first go to till kafka_2.12-2.8.0
		command to run zookeeper ---> .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
9. start the kakfka
		command to run kafka ---> .\bin\windows\kafka-server-start.bat .\config\server.properties
10. create topic inside kafka
		command to create topic ---> .\bin\windows\kafka-topics.bat --create --topic barath --bootstrap-server localhost:9092
11. view the topics
		command to view topic ---> .\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --list
12. kakfka Producer
		.\bin\windows\kafka-console-producer.bat --topic barath --bootstrap-server localhost:9092
13. kafka consumer
        .\bin\windows\kafka-console-consumer.bat --topic barath --from-beginning --bootstrap-server localhost:9092
		
