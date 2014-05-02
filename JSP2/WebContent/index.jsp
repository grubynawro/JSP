<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en"> 
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Login Form</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
<table align=right><tr><td><a href='register.jsp'>Zarejestruj sie</a></td></tr>
</table>
  <section class='container'> 
  <div class='login'> 
		<h1>Zaloguj sie na konto</h1>
		<form method='post' action='login'>
		<p><input type='text' name='email' value='' placeholder='Email'></p>
		<p><input type='password' name='pass' value='' placeholder='Password'></p>
		<p class='submit'><input type='submit' value='login'></p>
		</form>

	</div>
</section>

</body>
</html>
