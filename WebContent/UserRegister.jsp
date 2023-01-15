<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>

    <div>
    
     Welcome to FlyAway
     
     User Registration 
     
     <form action="UserRegistration" method="post" >
        
        Name <input name="name"  type="text" maxlenght=50><br>
        Email <input name="email" type="text"  maxlength=100><br>
        Password <input name="password" type="password" maxlength="20"><br>
  
        <button type="submit" value="Submit">Sign Up</button>
     
     </form>
     
    
    </div>


</body>
</html>