<?php 

$name = "Billy";

if($name == "Alex") echo "Hi, Alex";
else {
?>
	Please enter your name :<br> 
	<form action='index.php' method='POST'>
		<input type='text' name='myname'>
		<input type='submit' value='Submit'>
	</form>
<?php
}

 ?>