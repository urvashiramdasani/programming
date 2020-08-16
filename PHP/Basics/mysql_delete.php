<?php 

require("connect.php");

$todelete = $_POST['todelete'];

if($todelete) {
	$delete = $connect->query("DELETE FROM people WHERE id='$todelete'");
}

 ?>