<!DOCTYPE html>
<#import "spring.ftl" as spring/>
<head>
    <meta charset="UTF-8">
    <title><@spring.message 'signUp.page.title'/></title>
    <style>
        #div1{
            width: 100vw;
            height: 100vh;
            background:linear-gradient(#E5E3E4, rgba(91, 161, 153, 0.68),#BBC6C8);
        }


        .error {
            color: #b92525;
        }
    </style>
</head>
<body>
<div id="div1">
<h1><@spring.message 'signUp.page.header'/></h1>
<h2><@spring.message 'signUp.page.description'/></h2>
<form action="/signUp" method="post">
    <@spring.bind path="signUpForm"/>
    <p class="error">${spring.status.errorMessage}</p>
    <label for="firstName"><@spring.message 'signUp.form.label.enterFirstName'/></label>
    <#assign i18Tooltip><@spring.message code="signUp.form.placeholder.firstName"/></#assign>
    <@spring.formInput "signUpForm.firstName" "placeholder=${i18Tooltip}"/>
    <@spring.showErrors "<br>" "error"/>
    <br>
    <br>
    <label for="lastName"><@spring.message 'signUp.form.label.enterLastName'/></label>
    <#assign i18Tooltip><@spring.message code="signUp.form.placeholder.lastName"/></#assign>
    <@spring.formInput "signUpForm.lastName" "placeholder=${i18Tooltip}"/>
    <@spring.showErrors "<br>" "error"/>
    <br>
    <br>
    <label for="email"><@spring.message 'signUp.form.label.email'/></label>
    <#assign i18Tooltip><@spring.message code="signUp.form.placeholder.email"/></#assign>
    <@spring.formInput "signUpForm.email" "placeholder=${i18Tooltip}"/>
    <@spring.showErrors "<br>" "error"/>
    <br>
    <br>
    <label for="password"><@spring.message 'signUp.form.label.password'/></label>
    <#assign i18Tooltip><@spring.message code="signUp.form.placeholder.password"/></#assign>
    <@spring.formPasswordInput "signUpForm.password" "placeholder=${i18Tooltip}"/>
    <@spring.showErrors "<br>" "error"/>
    <br>
    <br>
    <input type="submit" value="Регистрация">
    <br>
    <a href="/signIn"></a>
</form>
</div>
</body>
</html>