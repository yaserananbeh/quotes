# quotes
This application responsible to take a json file that has an array of objects inside it and convert its content to objects then pick one object and return the author and the text of the quotes from it

## the dependencies that we use to make the app work is 
the Gson that allow us to convert a json file to objects

## lab 09
- to run the code you should add this dependency (implementation 'com.google.code.gson:gson:2.8.7')
- I've added new feature that make the app send a request to an api and get request, If the status of the request fail the  app will provide a random quote from static json file