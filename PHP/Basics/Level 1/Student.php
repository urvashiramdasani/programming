<!DOCTYPE html>
<html>
<head>
	<title>Student Form</title>
</head>
<body>
	<form action="Student.php" method="POST">
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
	$name = $_POST['name'];
	$sub1 = $_POST['sub1'];
	$sub2 = $_POST['sub2'];
	$sub3 = $_POST['sub3'];
	$sub4 = $_POST['sub4'];
	$sub5 = $_POST['sub5'];

	$total = $sub1 + $sub2 + $sub3 + $sub4 + $sub5;
	$percentage = $total / 5;

	echo "Name of Student : $name<br>";
	echo "Marks in each Subject<br>";
	echo "Subject 1 : $sub1<br>";
	echo "Subject 2 : $sub2<br>";
	echo "Subject 3 : $sub3<br>";
	echo "Subject 4 : $sub4<br>";
	echo "Subject 5 : $sub5<br>";
	echo "Total Marks Obtained : $total<br>";
	echo "Percentage : $percentage";
}

?>