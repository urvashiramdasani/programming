<?php 

require("connect.php");

$tochange = $_POST['tochange'];
$peoplename = $_POST['peoplename'];

if($tochange && $peoplename) {
	$change = $connect->query("UPDATE people SET firstname='$tochange' WHERE id='$peoplename'");
}

 ?>