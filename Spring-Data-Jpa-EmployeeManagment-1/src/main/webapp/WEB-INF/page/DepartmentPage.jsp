<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
       crossorigin="anonymous">
</head>
<body>
  <h1 style="color:red"> Department Registration Page </h1> 
 <form action="deptSevaData" method="post">
 
  <div class="form-group">
    <label for="Department Name">Department Name </label>
    <input type="text" class="form-control" name="name" aria-describedby="emailHelp" placeholder="Department Name">
   </div>
   
  <div class="form-group">
    <label for="Parent Department Id"> Parent Department Id </label>
    <input type="text" class="form-control" name="parent_dept_id" placeholder=" Parent Department Id ">
  </div>
  
  <button type="submit" class="btn btn-primary">Insert</button>
</form>  
        
</body>
</html>

<!-- <h1> Department Registration Page </h1>
        <pre>
           <form action="deptSevaData" method="post">
                
                Department Name       : <input type="text" name="name"> <br>
                Parent Department Id  : <input type="text" name="parent_dept_id"> <br>
                <input type="submit" value="Insert">
               
           </form>
        </pre> -->