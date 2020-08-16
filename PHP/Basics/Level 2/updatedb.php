<!DOCTYPE html>
<html>
<head>
	<title>Student Form</title>
</head>
<body>
	<form action="updatemarks.php" method="POST">
		<select name="peoplename">
			<?php

			require("connect.php");

			$extract = $connect->query("SELECT * FROM class1");

			while($row = $extract->fetch_assoc()) {
				$id = $row['id'];
				$name = $row['name'];
				$sub1 = $row['sub1'];
				$sub2 = $row['sub2'];
				$sub3 = $row['sub3'];
				$sub4 = $row['sub4'];
				$sub5 = $row['sub5'];

				echo "<option name='$id'>$name</option>";
			}

			?>	
		</select>
		<input type="text" name="tochange">
		<input type="submit" name="submit" value="Change">
	</form>
</body>
</html>

