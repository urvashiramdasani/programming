<?php  

$name = $_FILES["myfile"]['name'];
$type = $_FILES['myfile']['type'];
// echo $type; // multidimnesional array
$size = $_FILES['myfile']['size'];
$tmp_name = $_FILES['myfile']['tmp_name'];
// echo $tmp_name;
// echo $size;
$error = $_FILES['myfile']['error'];
// echo $error;

if($error > 0) {
	die("Error uploading file. Code $error");
}
else {
	if($type == "image/png" || $size > 500000) {
		die("That format is not allowed!");
	}
	else {
		move_uploaded_file($tmp_name, "uploaded/".$name);
		echo "Upload complete!";
	}
}

?>