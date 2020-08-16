<?php  

$submit = $_POST['submit'];

if($submit) {
	$fullname = strip_tags($_POST['fullname']);
	$username = strip_tags($_POST['username']);
	$password = strip_tags($_POST['password']);
	$repeatpassword = strip_tags($_POST['repeatpassword']);
	$date = date("Y-m-d");

	$connect = new mysqli("localhost","root","","phplogin");
	$namecheck = $connect->query("SELECT username FROM users WHERE username='$username'");

	$count = mysqli_num_rows($namecheck);
	if($count != 0) {
		die("Username already taken!");
	}

	if($fullname && $username && $password && $repeatpassword) {

		if($password == $repeatpassword) {
			if(strlen($fullname)>25 || strlen($username)>25) {
				echo "Maximum limit for fullname/username is 25 characters.";
			}
			else {
				if(strlen($password)>25 || strlen($password)<6) echo "Password must be between 6 to 25 characters."; 
				else {
					
					$query = $connect->query("INSERT INTO users VALUES('','$fullname','$username','$password','$date')");

					die("You have been successfully registered. <a href='user-form.php'>Return </a> to main page.");
				}
			}
		}
		else echo "Your passwords do not match!";
	}
	else echo "Please fill in <b>all</b> fields.";
}

?>

<!DOCTYPE html>
<html>
<head>
	<title>User Registration Form</title>
</head>
<body>
	<h1>Register</h1>
	<form action="register.php" method="POST">
		<table>
			<tr>
				<td>Your Full Name : </td>
				<td><input type="text" name="fullname" value="<?php echo $fullname;?>"></td>
			</tr>
			<tr>
				<td>Choose a username : </td>
				<td><input type="text" name="username" value="<?php echo $username;?>"></td>
			</tr>
			<tr>
				<td>Choose a password : </td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Repeat new password : </td>
				<td><input type="password" name="repeatpassword"></td>
			</tr>
		</table>
		<p></p>
		<input type="submit" name="submit" value="Register">
	</form>
</body>
</html>