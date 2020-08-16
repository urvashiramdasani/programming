<?php  

$userpassword = "abc";
$userpasswordenc = md5($userpassword);

if($_POST['password']) {
	if(md5($_POST['password']) == $userpasswordenc) {
		die("Correct");
	}
	else {
		die("Incorrect");
	}
}

?>

<!DOCTYPE html>
<html>
<head>
	<title>Encryption</title>
</head>
<body>
	<form action="md5.php" method="POST">
		<input type="text" name="password">
		<input type="submit" name="submit" value="Login">
	</form>
</body>
</html>