# BookUp-instacar
This is the repository for the instacar task round.

# Bookup is booking system for cab from bangalore to any city across india. It let you login using gmail account. and let you see your booking status in the history and also select driver using filter based on the languages and ratings. 

> please find anytime for suggestions and reviews. Also there are many things to do which due to less time couldn't achieve. thank you for patience and visiting.

# Bookup is booking system for cab from bangalore to any city across india. It let you login using gmail account. and let you see your booking status in the history and also select driver using filter based on the languages and ratings. 

> please find anytime for suggestions and reviews. Also there are many things to do which due to less time couldn't achieve. thank you for patience and visiting.

For Running the application follow this steps:

# Requirement:
`1) Docker
 2) jdk 1.8
 3) maven-3.6
 4) node-12
 5) angular-cli-8.3
 
# Run the application:
  - docker-compose up -d --build

# After running the above command check the running services using the command:
  - docker ps
 
# after checking that total 5 service and 2 database service is running follow this steps to continue:
  - docker exec -it <pid of mongoservice> bash
  - mongo -u root -p
  password: example
  - use userdatabse;
  - exit
  - exit

# after above steps again follow this steps:
 - docker exec -it <pid of mysql> bash
  - mysql -u root -p
  password: example
  - create database bookUp;
  - exit
  - exit
# add some driver data into the DB for running:
  - use postman and use post request and in the url (http://localhost:8080/book/driver)
    ---> post the data :
       ``` {
	         "driverName": "alex",
	         "rating": 4.3,
	         "languages": ["English","Hindi"],
	          "driverprice": 11
         } 
   ---> add some more objects for drivers data
# Wait for minute and Visit the location: (http://localhost:8080)
------------------------------------------------------------------------------------------------------------------------------
 **Once the above done the services are up and now this is the basic information as a developer purpose**
  
  - **|   PORTS      |        Service          |**
  -   |    8761      |    Eureka naming Server |
  -   |    8080      |    Zuul gateway Server  | 
  -   |    8000      |      user  Server       |
  -   |    8500      |    booking  Server      |
  -   |    8765      |     webapp  Server      |
  -   |    3306      |    mysql db Server      |
  -   |    27017     |    mongo db Server      |
    
   
   # Some screenshots for the visual of the running application and demo:
   follow this link for seeing the booking application:
   (https://drive.google.com/file/d/1tpGXQzEuuDxuZ2eWlEuM-4RP9K2Uw99E/view?usp=sharing)

   # Branching Strategy as:
      - master (production)
        - dev  (pre-stage)
          - release-0.1.0 (developer stage)
