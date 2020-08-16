<!DOCTYPE html>
<html>
<head>
	<title>Student Form</title>
</head>
<body>
	<form action="writedb.php" method="POST">
		Enter Name : <input type="text" name="name"><br>
		Enter Marks of five subjects<br>
		Subject 1 : <input type="text" name="sub1"><br>
		Subject 2 : <input type="text" name="sub2"><br>
		Subject 3 : <input type="text" name="sub3"><br>
		Subject 4 : <input type="text" name="sub4"><br>
		Subject 5 : <input type="text" name="sub5"><br>
		<input type="submit" name="submit" value="submit">
	</form>
</body>
</html>

<?php 

if($_POST['submit']) {
	// echo "hi";

	require("connect.php");

	$name = $_POST['name'];
	$sub1 = $_POST['sub1'];
	$sub2 = $_POST['sub2'];
	$sub3 = $_POST['sub3'];
	$sub4 = $_POST['sub4'];
	$sub5 = $_POST['sub5'];

	// echo $name;

	$total = $sub1 + $sub2 + $sub3 + $sub4 + $sub5;
	$percentage = $total / 5;

	$write = $connect->query("INSERT INTO class1 VALUES('','$name','$sub1','$sub2','$sub3','$sub4','$sub5','$total','500','$percentage')") or die(mysqli_error());
}

?>