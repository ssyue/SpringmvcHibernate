<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Student Information</h2>
<form method="POST" action="addUser.do">
   <table>
    <tr>
        <td>Name</td>
        <td><input name="username" /></td>
    </tr>
    <tr>
        <td>password</td>
        <td><input name="password" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form>
</body>
</html>