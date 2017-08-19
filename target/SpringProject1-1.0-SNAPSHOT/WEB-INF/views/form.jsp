
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>
    <link rel="stylesheet" href="/resources/style.css">

    <script language="JavaScript">
        function validate(){
            return validateEmail() && validatePassword();
        }
        function validateEmail(){
            var email = document.logon.memberEmail.value;
            var valid = true;

            if(email === null || email === ""){
                alert("Must input an email");
                valid = false;
            }
            email = email.trim();

            return valid;
        }
        function validatePassword(){

            var password1 = document.getElementById("password").value;
            var validate = true;

            if(password === null || password === ""){
                alert("Must input a password");
                valid = false;
            }

            return valid;
        }
    </script>

</head>
<body>
${inst}

<form action="addUser" method="post">
    First Name: <input type="text" name="FirstName" ><br>
    Birthday: <input type="number" name="Birthday"><br>
    Email: <input type="text" name="Email" maxlength="25" placeholder="name@email.com"><br>
    User Name: <input type="text" name="UserName"> <br>
    Password: <input type="password" name="Password" maxlength="25"><br>

    <input type="submit" name="submit" value="Submit">
</form>

</body>
</html>
