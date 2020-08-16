<!--  used to get information entered in form
 only 100 characters long
 visible to user -->

<!DOCTYPE html>
<html>
<head>
	<title>My first form</title>
</head>
<body>
	<form action="get.php" method="GET">
		<input type="text" name="myname">
		<input type="submit" value="Click Me!">
	</form>
</body>
</html>

<?php 

if($_GET['myname']) $name = $_GET['myname']; //use @ here to hide warnings
if($name) echo "Hello $name";

 ?>