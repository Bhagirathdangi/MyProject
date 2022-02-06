<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration Page</title>
</head>
<body>
    <form action="reqDepartment" method="post">
    <div class="form-floating mb-3">
  <input type="text" class="form-control" id="fName" placeholder="Frist Name">
  <label for="floatingInput">First Name</label>
  </div>
<div class="form-floating">
  <input type="text" class="form-control" id="designation" placeholder="Designation">
  <label for="floatingPassword">Designation</label>
</div>

<div class="form-floating">
  <input type="password" class="form-control" id="" placeholder="Last Name">
  <label for="floatingPassword">Last Name</label>
</div>

<div class="form-floating">
  <input type="password" class="form-control" id="ddept_id" placeholder="Last Name">
  <label for="floatingPassword">Department Id</label>
</div>

<div class="form-floating mb-3">
<input class="btn btn-primary" type="button" value="Insert">
</div>
  </form>
</body>
</html>



