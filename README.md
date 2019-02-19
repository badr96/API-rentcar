# CarRental Rest Web Service with Spring

Download and unzip the project (outside the Eclipse workspace)

Open a command line window (project location).

Use the following command to build the project (download libraries, compilation…):
-	gradlew build			    	under windows
-	./gradlew build			    	under Linux

Use the following command to convert the project in an Eclipse project:
-	gradlew eclipse					under windows
-	./gradlew eclipse				under Linux

Import the project under Eclipse: File->Import->General-> Existing project into workspace ... select the project directory

Open a web browser to test the http get request: http://localhost:8080/cars

# Java Rest client

Launch the main program: https://github.com/badr96/IST
# Javascript client

Open a web browser to test the Javascript program: http://localhost:8080/static/index.html
Tuto:
http://www.springboottutorial.com/spring-boot-and-h2-in-memory-database

SQL web console:
http://localhost:8080/h2-console

Make sure that you use jdbc:h2:mem:testdb as JDBC URL.

this tree had the message broker functionality (Activemq):
apache-actvemq-5.15.6/bin/./activmq
password:admin
