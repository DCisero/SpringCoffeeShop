<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="it" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Welcome!</title>
    <link rel="stylesheet" href="/resources/style.css">
</head>

<body>
<h1>Dreamy Delight Cafe!</h1>
<br/>
<p>Welcome new <i>Dreamers</i>, please fill out a registry form: <a href="userform"> Register</a></p>

<!--<<img src="https://cdn.theculturetrip.com/wp-content/uploads/2015/12/24446651320_aa7abf37ca_k.jpg"
     alt="coffee" height="300" width="400">-->

<h2>Dreamy Delight Menu:</h2>

<table align="center" border="2">
    <tr>
        <th>Item Name</th>
        <th>Description</th>
        <th>Quantity</th>
        <th>Price</th>
    </tr>
    <it:forEach items="${itList}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.description}</td>
           <td>${item.quantity}</td>
            <td>$ ${item.price}</td>
        </tr>

    </it:forEach>
</table>

</body>
</html>
