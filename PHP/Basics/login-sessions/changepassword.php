<?php  

session_start();

$user = $_SESSION['username'];

if($user) {

	if($_POST['submit']) {
		$oldpassword = $_POST['oldpassword'];
		$newpassword = $_POST['newpassword'];
		$confirmpassword = $_POST['confirmpassword'];

		$connect = new mysqli("localhost", "root", "", "phplogin") or die(mysql_error()); 
		$query = $connect->query("SELECT password FROM users WHERE username='$user'");
		$row = $query->fetch_assoc();
		$oldpassworddb = $row['password'];

		if($oldpassword == $oldpassworddb) {
			if($newpassword == $confirmpassword) {

				$querychange = $connect->query("UPDATE users SET password='$newpassword' WHERE username='$user'");

				session_destroy();
				die("Your password has been changed. <a href='user-form.php'>Return</a> to the main page");
			}
			else die("New passwords don't match!");
		}
		else die("Old password doesn't match!");
	}


	echo "
	<form action='changepassword.php' method='POST'>
		Old Password : <input type='text' name='oldpassword'><p>
		New Password : <input type='password' name='newpassword'><br>
		Confirm Password : <input type='password' name='confirmpassword'><p>
		<input type='submit' name='submit' value='Change password'>
	</form>

	";
}
else die("You must be logged in to change your password.");

?>