<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address Registration Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
       crossorigin="anonymous">
</head>
<body>
<h1 style="color:blue"> Address Registration Page</h1>
   
   <form action="addSaveData" method ="post">
   
  <div class="form-group">
    <label for="Street">Street:</label>
    <input type="text" class="form-control" placeholder="Street" name="street">
  </div>
  
  <div class="form-group">
    <label for="City">City:</label>
    <input type="text" class="form-control" placeholder="City" name="city">
  </div>
  
   <div class="form-group">
    <label for="Zip/Pin ">Zip/Pin :</label>
    <input type="text" class="form-control" placeholder="Zip/Pin " name="zip">
  </div>
  
  <div class="form-group">
    <label for="State">State:</label>
    <input type="text" class="form-control" placeholder="State" name="State">
  </div>
  
  <div class="form-group">
    <label for="Country">Country:</label>
    <input type="text" class="form-control" placeholder="Country" name="country">
  </div>
  
   <div class="form-group">
    <label for="Employee Id ">Employee Id :</label>
    <input type="text" class="form-control" placeholder="Employee Id" id="emmp_id">
  </div>
  
  <button type="submit" class="btn btn-primary">Insert</button>
</form>  
       
       
</body>
</html>

<!-- <h1> Address Registration Page</h1>
       <pre>
            <form action="addSaveData" method ="post">
            
            Street          : <input type="text" name="street"><br>
            City            : <input type="text" name="city"><br>
            Zip/Pin         : <input type="text" name="zip"><br>
            State           : <input type="text" name="State"><br>
            Country         : <input type="text" name="country"><br>
            Employee Id     : <input type="text" name="emmp_id"><br>
            <input type="submit" value="Insert">
            </form>
       </pre> -->