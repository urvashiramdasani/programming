<?php  

session_start(); // we need session_start() in any file that defines or calls sessions

if($_SESSION['username']) {
	echo "Welcome, ".$_SESSION['username']."!<br><a href='logout.php'>Log out</a>";
	echo "<br><a href='changepassword.php'>Change Password</a>";
}
else die("You must be logged in!");

?>