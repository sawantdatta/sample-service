# sample-service
Exmaple of DockerFile with docker build push remove local images and run image from docker container
Below steps need to follow : -
1. Create Login account into Docker Desktop
2. Create sample application
3. go to root of sample applcation
4. Create Repo int the Docker Desktop -> datta1981/javaprojects/
5. Execute command from the power shell to cerate image
  ** docker build -t <image-name sample-service-1.0.0> .**
6. Type docker images this command will lisrt down the images that are created
7. Tag docker image to the docker desktop repo
   ** docker tag  <sample-service-1.0.0> <datta1981/javaprojects>**
8. Push image into docker hub
   **docker push datta1981/javaprojects**
9. Type docker images this command will show 2 images 1 application image and 2 repo image
    **sample-service-1.0.0
    datta1981/javaprojects**
10. Login docker
    **docker login**
12. Remove docker images from local
    **docker rmi sample-service-1.0.0 datta1981/javaprojects**
13. type **docker login**
14. run image from the container
    **docker run -p 8080:8080 datta1981/javaprojects**
15. Now open browser:-
  **http://localhost:8080/api/v1/**  hit enter below raw data get displayed in browser.
   {"last name":"XYZ","first name":"ABC","mobile number":"123456789"}
    
    
    
    
