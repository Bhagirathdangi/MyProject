<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
       crossorigin="anonymous">
</head>
<body>
   <h1 style="color:blue"> Employee Registration Page</h1>
     <form action="empSaveData" method ="post">  
  <div class="form-group">
    <label for="First Name">First Name:</label>
    <input type="text" class="form-control" placeholder="First Name " name="fName">
  </div>
  
  <div class="form-group">
    <label for="Last Name ">Last Name :</label>
    <input type="text" class="form-control" placeholder="Last Name " name="lName">
  </div>
  
   <div class="form-group">
    <label for="Designation ">Designation :</label>
    <input type="text" class="form-control" placeholder="Designation " name="designation">
  </div>
  
  <div class="form-group">
    <label for="DepartMent ID">DepartMent ID:</label>
    <input type="text" class="form-control" placeholder="DepartMent ID" name="ddept_id">
  </div>
  
  <button type="submit" class="btn btn-primary">Register</button>   
  </form>       
</body>
</html>

<!-- <h1> Employee Registration Page</h1>
         <pre>
           <form action="empSaveData" method ="post">
           
               First Name       :   <input type="text" name="fName"><br>
               Last Name        :   <input type="text" name="lName"><br>
               Designation     :   <input type="text" name="designation"><br>
               DepartMent ID    :   <input type="text" name="ddept_id"><br>
               <input type="submit" value="Insert">     
           </form>
         </pre> -->
