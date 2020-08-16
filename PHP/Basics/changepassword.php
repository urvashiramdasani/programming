<?php  

session_start();

$user = $_SESSION['username'];

if($user) {

	if($_POST['submit']) {
		$oldpassword = md5($_POST['oldpassword']);
		$newpassword = md5($_POST['newpassword']);
		$confirmpassword = md5($_POST['confirmpassword']);

		if($oldpassword && $newpassword && $confirmpassword) {

		}
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