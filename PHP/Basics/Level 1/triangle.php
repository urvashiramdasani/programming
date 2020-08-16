<!DOCTYPE html>
<html>
<head>
	<title>My Triangle </title>
</head>
<body>
	<form action="triangle.php" method="GET">
		Side 1 : <input type="text" name="side1"><br>
		Side 2 : <input type="text" name="side2"><br>
		Side 3 : <input type="text" name="side3"><br>
		<input type="submit" name="submit" value="Submit">
	</form>
</body>
</html>

<?php  

if($_GET['submit']) {
	$side1 = $_GET['side1'];
	$side2 = $_GET['side2'];
	$side3 = $_GET['side3'];

	if($side1 == $side2 && $side2 == $side3 && $side3 == $side1) echo "Equilateral";
	else if(($side1 == $side2 && $side1 != $side3) || ($side1 == $side3 && $side1 != $side2) || ($side2 == $side3 && $side2 != $side1)) echo "Isosceles";
	else if(($side1 * $side1 + $side2 * $side2 == $side3 * $side3) || ($side1 * $side1 + $side3 * $side3 == $side2 * $side2) || ($side3 * $side3 + $side2 * $side2 == $side1 * $side1)) echo "Right Angled";
	else echo "Scalene";
}

//echo "hi";

?>