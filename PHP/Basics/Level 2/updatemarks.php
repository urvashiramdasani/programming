<?php  

require("connect.php");

$tochange = $_POST['tochange'];
$peoplename = $_POST['peoplename'];

if($tochange && $peoplename) {
	$change = $connect->query("UPDATE class1 SET sub5='$tochange' WHERE id='$peoplename'");
	echo "Successful";
}

?>