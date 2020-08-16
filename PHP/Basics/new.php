<?php  

session_start(); // session doesnt need to be declared here. as long as sessions.php is in the same directory or the browser is not closed

echo $_SESSION['name'];

?>