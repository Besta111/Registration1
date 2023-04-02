<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SignUp</title>
    <style>
        #div1{
            width: 100vw;
            height: 100vh;
            background:linear-gradient(#E5E3E4, rgba(91, 161, 153, 0.68),#BBC6C8);
        }
        </style>
</head>
<body>
<div id="div1">
<h1 >Sign In Page</h1>
<h2>Please Enter your data:</h2>
<form action="/signIn" method="post">
    <label for="email">Введите email:</label>
    <input type="email" id="email" name="email" placeholder="Your email">
    <br>
    <label for="password">Введите пароль:</label>
    <input type="password" id="password" name="password" placeholder="Your password">
    <input type="submit" value="Войти">

</form>
</div>
</body>
</html>