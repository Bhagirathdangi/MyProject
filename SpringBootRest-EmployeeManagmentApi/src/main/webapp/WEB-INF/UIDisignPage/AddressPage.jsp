<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address Page</title>
</head>
<body>
    
    <h1> Address Page</h1>
    <form action="reqDepartment" method="post">
    <div class="form-floating mb-3">
  <input type="text" class="form-control" id="street" placeholder="Street">
  <label for="floatingInput">Street</label>
  </div>
<div class="form-floating">
  <input type="password" class="form-control" id="city" placeholder="City">
  <label for="floatingPassword">city</label>
</div>

<div class="form-floating">
  <input type="password" class="form-control" id="zip" placeholder="Zip">
  <label for="floatingPassword">Zip</label>
</div>

<div class="form-floating">
  <input type="password" class="form-control" id="State" placeholder="State">
  <label for="floatingPassword">State</label>
</div>

<div class="form-floating">
  <input type="password" class="form-control" id="country" placeholder="Country">
  <label for="floatingPassword">Country</label>
</div>

<div class="form-floating mb-3">
<input class="btn btn-primary" type="button" value="Insert">
</div>
  </form>
</body>
</html>


