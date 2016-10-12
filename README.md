# Client Application sample with SpringBoot JPA

## Installation
### Prerequisite
* git (the latest) - to get the source but also needed during the build 
* java 1.8 32bit - needed for the build and the run
* maven 3 or later - needed for the build
* mysql DB (Application uses Mysql for creating some data test in startup)

### Installation from source
In order to build application you have to
1- Get source from GIT repository folder (through zip download or git clone)

2- Configure the connexion with MySQL DB with some key properties properties in file "application.properties"

3- Go to the root and type the following command
<pre>
mvn clean install
</pre>

5- Start Application
<pre>
mvn springboot:run
</pre>

6- Test some rest api with calling url http://localhost:8181/client/all in your browser.