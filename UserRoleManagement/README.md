 # Build and deploy procedure:

http://localhost:8080/

Build Tool : Maven 3
FrameWork : Spring Boot
Server : InBuild Spring Boot Server


url: http://localhost:8080/addUserData
Request : [{"id":1,"name":"Ram","designation":"Emp","permission":"Admin"}]
Header : Content-Type = application/json
Type : Post

url: http://localhost:8080/userList
Type : Get

http://localhost:8080/user?id=5
Type : Get


 # Functionalities chosen to implement:
CRUD operation on CSV
Rest mapping 
Output in Log files 


 # Functionalities are implemented and what are the main challenges that you took into account when performing the implementation (business reasons, technical and infrastructure reasons, etc)



 # Functionalities that could be added in the future to the application in order to make it more attractive to potential clients
- Adding data to database using Spring Repo
- Adding authentication from accessing to doing operation in CSV
- Storing such CSV files to AWS EC cloud for easy storage
- Rest URLs authentication
-  




