<?php  

// $file = fopen("count.txt","w");
// fwrite($file, "0");

$visitors = file_get_contents("count.txt");
echo "You have had $visitors visitors";

$visitorsnew = $visitors + 1;

$file = fopen("count.txt","w");
fwrite($file, $visitorsnew);

?>