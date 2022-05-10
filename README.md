###### **Political Speeches**

This service helps to perform analysis on the csv files. It exposes an endpoint which takes url as input and provide meaningful insights from the data.

**Running the application**

_On Localhost:_ Please run the following commands when running the application locally:
```
Install Java 11, maven, docker, docker desktop
mvn clean install
docker-compose up -----from the prject repo

```

![Building Jar File ](https://github.com/Hansagupta27/PoliticalSpeeches/raw/main/readmeGif/Building%20jar%20file.gif)


![Starting docker compose ](https://github.com/Hansagupta27/PoliticalSpeeches/raw/main/readmeGif/Starting%20Docker-compose.gif)


_Using Minikube exposed as a service on kubernetes:_ Please run the following commands:

````
brew install minikube (If not already installed)
minikube start

Commands to be executed in the application folder

eval $(minikube docker-env) (To run it in Minikube session)
Docker build -t PoliticalSpeeches . (Building the docker image of the app)
Kubectl create -f deployment.yml (Using the deployment file to create kubernetes deployment)
kubectl expose deployment PoliticalSpeeches-deployment --type=NodePort (exposing the deployment as a service in kubernetes)
minikube service PoliticalSpeeches-deployment --url (Get the url where minikube exposes the service. Use it to hit the URL)

````
*The application can be accessed over Swagger UI as well once it is started.
The url to access is HOST-URL/swagger-ui.html*



**Functionality**

The application currently exposes the below endpoint:
File Hosting Controller is used here to host the csv files locally for testing purpose.

GET **/analysis/csv** - Get endpoint to fetch the analytics information.

```
curl --request GET http://localhost:8080/analysis/csv?url=http://localhost:8080/fileHosting/politicalSpeechTest.csv

```
and provides information about 
```
1. most Speeches by a Speaker in 2013
2. Speaker who spoke most on the topic "Internal Security"
3. Speaker who spoke the least number of words

```
![One Url input with valid data](https://github.com/Hansagupta27/PoliticalSpeeches/raw/main/readmeGif/One%20url%20Input%20with%20valid%20data.gif)

![Multi Url input with valid data](https://github.com/Hansagupta27/PoliticalSpeeches/raw/main/readmeGif/Two%20urls%20Input%20with%20valid%20data.gif)

![Invalid Data](https://github.com/Hansagupta27/PoliticalSpeeches/raw/main/readmeGif/Invalid%20Data.gif)

 
