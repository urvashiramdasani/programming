<!-- // cookies are set of information stored on user's computer from web server
// time() - time from January 1st 1970 -->

<?php  

$exp = time() + 86400; // expires in one day 24 * 60 * 60
$exp_unset = time() - 86400;
// setcookie("name", "Alex", $exp);
// setcookie("age", "19", $exp);

// echo $_COOKIE['name'];
// echo $_COOKIE['age'];

// print_r($_COOKIE);

// unset a cookie
// setcookie("name", "", $exp_unset);

if(isset($_COOKIE['name'])) echo "Cookie is set";
else echo "Cookie is not set";

?>