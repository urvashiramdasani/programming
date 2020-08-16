<?php 

$pos = 1;

$alpha = array(
	'ABC' => array('A','B','C','D') ,
	'123' => array(1,2,3,4) );

echo "Letter ".$alpha['ABC'][$pos]." is in position ". $alpha['123'][$pos];

 ?>