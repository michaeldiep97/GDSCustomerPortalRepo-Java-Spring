# Customer Portal Spring App

## About

This is a grocery delivery system customer portal built on Java 8

The goal is to allow users to shop for products.

It was made using **Spring Framework** technologies and **Thymeleaf**. 

There are currently issues with database set-up. Two solutions are to either embed the database using technologies like HSQL or H2, or save data to file(s) where it can be read into objects during runtime. Our current solution is having data stored in-session, meaning there is no persistence for features like the cart. The data for each product is hard-coded.

When building the project, be sure to follow the instructions to run carefully. Spring is highly extensible, so in implementing any functionality it may be helpful to review and install spring guide projects via the Spring Tool Suite. Read more about STS below.

## TODO

Fix database connection

## Configuration

## How to run

You will need:
	Eclipse Oxygen,
	Spring Tool Suite, 
	Apache Tomcat servelett (just the binaries),
	Maven
	
To install STS, open Eclipse, click Help > Eclipse Marketplace and search for Spring tool suite.
	
To install Tomcat download the binaries zip file at https://tomcat.apache.org/download-90.cgi
Unzip to your C:\Program Files folder, then add the bin to your path.

Maven is distributed with Eclipse, no need to install.

The easiest way to run the application is through the Spring Tool Suite's Boot Dashboard. First, right-click the project folder > Run As > Maven Build. When the Build prompt appears, enter clean install as a goal. After the project is built, you will see it in the Boot Dashboard. Run the App from here. If you do not see the project here, try changing the java build path to the latest JDK version, then re-build as before.

Once the app starts, go to your web browser and visit `http://localhost:8080`, the app is initialized on port 8080 by the Apache servelett.
If you cannot host on port 8080, terminate whatever process is listening on the port.
