<?php  

$submit = $_POST['submit'];

if($submit) {
	$name = $_FILES["myfile"]['name'];
	$type = $_FILES['myfile']['type'];
// echo $type; // multidimnesional array
	$size = $_FILES['myfile']['size'];
	// $tmp_name = $_FILES['myfile']['tmp_name'];

	echo "File Details ... <br>";
	echo "File Name : $name<br>";
	echo "Type : $type<br>";
	echo "Size : $size bytes<br>";
}

?>

<!DOCTYPE html>
<html>
<head>
	<title>File Upload</title>
</head>
<body>
	<h1>Upload File...</h1>
	<form action="file.php" method="POST" enctype="multipart/form-data">
		<input type="file" name="myfile"><p>
		<input type="submit" name="submit" value="Upload">
	</form>
</body>
</html>