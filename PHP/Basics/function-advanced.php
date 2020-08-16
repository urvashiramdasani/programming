<?php 

function calc($num1, $num2, $op) {
	
	switch($op) {

		case "+" : $total = $num1 + $num2;
					return $total;
					break;

		case "-" : $total = $num1 - $num2;
					return $total;
					break;

		case "*" : $total = $num1 * $num2;
					return $total;
					break;

		case "/" : $total = $num1 / $num2;
					return $total;
					break;

		default : echo "Unknown Operator.";
					break;


	}
}

echo calc(10,23,"*");

 ?>