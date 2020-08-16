<!DOCTYPE html>
<html>
<head>
	<title>Output</title>
</head>
<body>
		<?php 
		//echo 'hi from php';
		require("connect.php"); // or use include

		$date = date("Y-m-d"); // YYYY-MM-DD // by default takes current date

		// write some data
		// $write = $connect->query("INSERT INTO people VALUES('','Dale','Harrett','1990-07-24','M')") or die(mysqli_error()); // mysql_query is the function 

		// we can use $connect->error to report error
		// update data
		// $update = $connect->query("UPDATE people SET dob='1989-11-16' WHERE id='1'");

			//extract data
			$firstname_form = $_POST['firstname'];
			$lastname_form = $_POST['lastname'];
			// echo "hi ";

			$extract = $connect->query("SELECT * FROM people WHERE firstname='$firstname_form' AND lastname='$lastname_form' ORDER BY id DESC");

			$numrows = mysqli_num_rows($extract);

			while($row = $extract->fetch_assoc()) { // mysql_fetch_assoc($extract) is 	used
				$id = $row['id'];
				$firstname = $row['firstname'];
				$lastname = $row['lastname'];
				$dob = $row['dob'];
				$gender = $row['gender'];

				echo "$firstname $lastname was born on $dob and is $gender<br>";
			}

		?>
</body>
</html>
