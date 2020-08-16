<?php 

$matrix1 = array(1,2,3,4);
$matrix2 = array(5,6,7,8);
$sum = array(0,0,0,0);

for($i = 0;$i<4;$i++) {
	$sum[$i] = $matrix1[$i] + $matrix2[$i];
}

for($i = 0;$i<4;$i++) {
	echo "$sum[$i] ";
}
 ?>