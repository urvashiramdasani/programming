<!-- same as get
 no character limit
 invisible to user, safe -->

<!DOCTYPE html>
<html>
<head>
	<title>My second form</title>
</head>
<body>
	<form action="post.php" method="POST">
		<input type="text" name="myname">
		<input type="submit" value="Click Me!">
	</form>
</body>
</html>

<?php 

$name = $_POST['myname'];
echo "Hello $name";

 ?>