<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Student Information</h2>
<form method="POST" action="addStudent">
   <table>
    <tr>
        <td>Name</td>
        <td><input name="name" /></td>
    </tr>
    <tr>
        <td>Age</td>
        <td><input name="age" /></td>
    </tr>
    <tr>
        <td>id</td>
        <td><input name="id" /></td>
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