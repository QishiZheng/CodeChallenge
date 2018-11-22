# CodeChallenge
This is the solution for Paypont Code Challenge.

#Instructions
1. Clone or download the whole application.
2. Turn on your MySQL server, and import the **userAPI.sql** file in the root directory to create the database for the application.
3. Go to **/UserAPI/src/main/resources/application.properties**, change database server config, username and password in the file to yours
4. To build and run the Application 1, you have two options:
    + **Option 1**: Navigate to the **CodeChallenge/UserAPI** directory using Terminal, and run this command in terminal (Make sure you have Maven installed on your computer)

          mvn clean package
        This command will build the application, to run it, run the following command

          java -jar target/UserAPI-1.0-SNAPSHOT.jar

    + **Option 2**: Import the **CodeChallenge/UserAPI** as a project using IntelliJ IDEA or any IDE you like, then run the **main** method in **CodeChallenge/UserAPI/src/main/java/userManagement/Main.java**
5. To host the Application 2 website,
    + Turn on your Apache Web Server.
    + Simply place the whole directory **CodeChallenge/website** in the **htdocs** folder of your server.
6. Open your browser, and enter **http://localhost/website/index.html**  
    + The index page will automatically load all user data stored in the database once the page is ready via AJAX.
    + Type in the surname you would like to search in the search bar and click button "Search" button, then the user table will be updated with the search results returned from Application 1 API via AJAX.
