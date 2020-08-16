<?php  

session_start();

session_destroy();

echo "You have been logged out! <a href='user-form.php'>Click here</a> to return.";

?>