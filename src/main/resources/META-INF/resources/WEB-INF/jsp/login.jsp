<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>login Page</title>
  </head>
  <body>
    <div class="container">
      <!-- Welcome to the login page ${name}! -->
      Welcome to the login page!

      <pre>${errorMessage}</pre>

      <form method="post">
        Name:<input type="text" name="name" /> Password:<input
          type="password"
          name="password"
        />
        <input type="submit" />
      </form>
    </div>
  </body>
</html>
