<html>
<body>
login page 한글은.깨지겠지?
<br>
<form method="post" action="/shop/login">
    loginId : <input type="text" name="loginId"><br>
    password : <input type="password" name="password"><br>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input type="submit">
</form>
</body>
</html>