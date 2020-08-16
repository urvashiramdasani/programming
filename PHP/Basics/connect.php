<?php 

// mysql_connect() is used
// error_reporting(1);
$connect = new mysqli("localhost","root","","phpacademy") or die(mysql_error());

// $mysql_select_db("phpacademy") or die(mysql_error())

echo "Connected";

 ?>