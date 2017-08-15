
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>

    <script language="JavaScript">
        function validate(){
            return validateEmail() && validatePassword();
        }
        function validateEmail(){
            //one way of getting info from a form
            var email = document.logon.memberEmail.value;
            var valid = true;

            if(email === null || email === ""){
                alert("Email cannot be blank");
                valid = false;
            }
            email = email.trim();
            if (email.indexOf("@") <= 0){
                alert("You must have a username before @");
                valid = false;
            }

            if (valid){
                alert ("Validation passed");
            }
            return valid;
        }
        function validatePassword(){
            //another way of getting info
            var password1 = document.getElementById("password1").value;
            var password2 = document.getElementById("password2").value;
            var validate = true;

            if(password1 === null || password1 === ""){
                alert("Password cannot be blank");
                valid = false;
            }

            if(password1 !== password2){
                alert("Password don't match");
                valid = false;
            }

            return valid;
        }

    </script>

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
