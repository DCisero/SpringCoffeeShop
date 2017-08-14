
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>
</head>
<body>
${inst}

<form action="formhandler" method="post">
    Full Name: <input type="text" name="name" ><br>
    Birthday: <input type="number" name="bday"><br>
    Email: <input type="text" name="email" maxlength="25" placeholder="name@email.com"><br>
    User Name: <input type="text" name="username"> <br>
    Password: <input type="password" name="password" maxlength="25"><br>

    <input type="submit" name="submit" value="Submit">
</form>

</body>
</html>
