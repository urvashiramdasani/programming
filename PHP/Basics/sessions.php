<!-- id of sessions are stored in cookie
limited expiry period, destroyed as soon as browser is closed -->

<?php  

session_start();

// $_SESSION['name'] = "Alex";
// echo $_SESSION['name'];

// unset($_SESSION['name']);
// echo $_SESSION['name'];

session_destroy();

?>