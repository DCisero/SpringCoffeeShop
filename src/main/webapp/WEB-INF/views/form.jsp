
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>User Form</title>
</head>
<body>
${inst}

<form action="formhandler" method="post">
    Name: <input type="text" name="name" ><br>
    Email: <input type="text" name="email"><br>
    <input type="submit" name="submit" value="Submit">
</form>

</body>
</html>
