<?php 

function myName() {
	echo "Alex";
}

function yourName($name, $age) {
	echo "Your name is ".$name." and you are ".$age." years old";
}

echo "My name is ";
myName();
yourName("Billy", 16);

 ?>