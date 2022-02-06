<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    
    <title>Department Registration Page</title>
  </head>
  <body>
    <h1> Department Registration form</h1>
    <form action="reqDepartment" method="post">
    <div class="form-floating mb-3">
  <input type="text" class="form-control" id="name" placeholder="Department Name">
  <label for="floatingInput">Department Name</label>
  </div>
<div class="form-floating">
  <input type="password" class="form-control" id="parent_dept_id" placeholder="Parent Department ID">
  <label for="floatingPassword">Parent Department Id</label>
</div>

<div class="form-floating mb-3">
<input class="btn btn-primary" type="button" value="Insert">
</div>
  </form>  
  </body>
</html>