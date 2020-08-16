<?php  

$dir = "images/";

if($opendir = opendir($dir)) {
	while(($file = readdir($opendir)) !== FALSE) {
		if($file != "." && $file != "..") echo "<img src='$dir/$file'><br>";
	}
}

?>