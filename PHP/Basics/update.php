<!DOCTYPE html>
<html>
<head>
	<title>Update Form</title>
</head>
<body>
	<form action="mysql_delete.php" method="POST">
		<select name="todelete">
		<?php 

		require("connect.php"); // or use include

		$date = date("Y-m-d");

		$extract = $connect->query("SELECT * FROM people");

		$numrows = mysqli_num_rows($extract);
		// 
		while($row = $extract->fetch_assoc()) { // mysql_fetch_assoc($extract) is 	used
			$id = $row['id'];
			$firstname = $row['firstname'];
			$lastname = $row['lastname'];

			echo "<option value='$id'>$firstname</option>";
		}
		// 

		 ?>
		 </select>
		 <input type="submit" value="Delete" name="submit">
	</form>
</body>
</html>