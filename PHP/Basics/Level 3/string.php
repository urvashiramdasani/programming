<?php  

$submit = $_POST['submit'];

if($submit) {
	$string = $_POST['string'];
	$substring = $_POST['substring'];
	$sublen = strlen($substring);

	$length = strlen($string);
	$array = explode(" ", $string);
	$reverse = strrev($string);
	$lower = strtolower($string);
	$upper = strtoupper($string);
	$replace = substr_replace($string, $substring, 0, $sublen);

	echo "Length of String : $length<br>";
	echo "String to Char Array : $array<br>";
	echo "Reversed String : $reverse<br>";
	echo "Lowecase : $lower<br>";
	echo "Uppercase : $upper<br>";
	echo "Replaced String : $replace";
}

?>

<!DOCTYPE html>
<html>
<head>
	<title>Strings Assignment</title>
</head>
<body>
	<form action="string.php" method="POST">
		Enter a String : <input type="text" name="string"><br>
		Enter a Substring : <input type="text" name="substring"><br>
		<input type="submit" name="submit" value="Submit">
	</form>
</body>
</html>