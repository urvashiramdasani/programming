<?php  

session_start();

$username = $_POST['username'];
$password = $_POST['password'];

if($username && $password) {
	$connect = new mysqli("localhost", "root", "", "phplogin") or die(mysql_error());
	$query = $connect->query("SELECT * FROM users WHERE username='$username'");
	$numrows = mysqli_num_rows($query);
	// echo $numrows;
	if($numrows != 0) {
		while($row = $query->fetch_assoc()) {
			$dbusername = $row['username'];
			$dbpassword = $row['password'];
		}

		if($dbpassword == $password) {
			echo "You are in! <a href='member.php'>Click</a> here to enter member page.";
			$_SESSION['username'] = $dbusername;
		} 
		else echo "Incorrect password!";
	}
	else die("User Doesn't Exist!");
}
else {
	echo "Please provide a username and a password";
}

?>