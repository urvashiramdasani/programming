<?php  

$string = "Hello";
echo strlen($string);
echo mb_substr($string,0,2);

$string1 = "1 2 3 4 5";
$exparray = explode(" ", $string1);
echo $exparray[3];

$string1 = implode($exparray, " "); // or use join
echo $string1;

echo nl2br("Hi
	There I am
	God");

echo strrev("Hello");

$s = "HeeLooooo";
echo strtolower($s);
echo strtoupper($s);
echo "<br>";

$search = "My name is alex. What is your name?";
$result = substr_count($search, "name"); // two optional argument for the index to start ans stopping index
echo $result;

$replace = "My name is alex.";
$result = substr_replace($replace, "billy", 11, 14);
echo $result;


?>