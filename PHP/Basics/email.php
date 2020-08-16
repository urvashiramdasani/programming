<?php  

$to = "urvashi.ramdasani@gmail.com";
$subject = "Email from PHPAcademy";

if($_POST['submit']) {
	$name = $_POST['email'];
	$message = $_POST['message'];
	$headers = "From: admin@PHPAcademy.com";
	// echo "$name"." $message";

	// set SMTP in php.ini
	ini_set("SMTP", "mailhost@nirmauni.ac.in"); // mail server
	// echo ini_get("SMTP");
	// die();

	if($name && $message) {
		if(strlen($name)<=30 && strlen($message)<=300) {
			$body = "This mail is from $name\n\n $message";
			mail($to, $subject, $body, $headers);
		}
		else {
			die("Max length for name is 20, max length for message is 300");
		}
	}
	else {
		die("You must enter a name <u>and</u> message");
	}
}

?>

<!DOCTYPE html>
<html>
<head>
	<title>Email</title>
</head>
<body>
	<form action="email.php" method="POST">
		Name : <input type="email" name="email" maxlength="30"><p>
		Message : <br><textarea name="message"></textarea><p>
			<input type="submit" name="submit" value="Send">
	</form>
</body>
</html>