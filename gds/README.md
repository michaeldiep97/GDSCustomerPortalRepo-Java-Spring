# Customer Portal Spring App

## About

This is a grocery delivery system customer portal built on Java 8

The goal is to allow users to shop for products.

It was made using **Spring Framework** technologies and **Thymeleaf**. 

A potential route for development is to have all the logic placed in a new package where it can be called from the controllers.

There are currently issues with database set-up.Two solutions are to either embed the database using technologies like HSQL or H2, or save data to file(s) where it can be read into objects during runtime.

There were also issues with building the project, so make sure to follow the instructions to run carefully. Spring is highly extensible, so in implementing any functionality it may be helpful to review and install spring guide projects via the Spring Tool Suite. Read more about STS below.

I've also made a few demo java controllers and corresponding html templates. These could help if you're feeling lost. I know I was, especially since I haven't really touched web in detail.



## TODO

determine database set-up
simulate login
translate prototype java classes into code
implement item search
implement cart
implement mock checkout

## Configuration

## How to run

You will need:
	Eclipse Oxygen
	Spring Tool Suite 
	Apache Tomcat servelett (just the binaries)
	Maven (just the binaries)
	
To install STS, open Eclipse, click Help > Eclipse Marketplace and search for Spring tool suite.
	
To install Tomcat download the binaries zip file at https://tomcat.apache.org/download-90.cgi
Unzip to your C:\Program Files folder, then add the bin to your path by running sysdm.cpl > Advanced tab > environment variables > system variables > Path > edit

Maven should be on Eclipse already.

The easiest way to run the application is through the Spring Tool Suite's Boot Dashboard. First, right-click the project folder > Run As > Maven Build. When the Build prompt appears, in goals type clean install. After the project is built, you will see it in the Boot Dashboard. Run the App from here. If you do not see the project here, try changing the java build path to the latest JDK version, then re-build as before.

Once the app starts, go to your web browser and visit `http://localhost:8080`