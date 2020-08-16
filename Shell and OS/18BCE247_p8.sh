id=0
search()
{
	echo "Enter Employee ID : "
	read empid
	x=1
	while read -r line;
	do
		tmpid=$(echo "$line" | cut -d ' ' -f 1)
		if [ $tmpid -eq $empid ]
		then
			name=$(echo "$line" | cut -d ' ' -f 2)
			city=$(echo "$line" | cut -d ' ' -f 3)
			age=$(echo "$line" | cut -d ' ' -f 4)
			pos=$(echo "$line" | cut -d ' ' -f 5)
			x=0
			break
		fi
	done < "emp.txt"
	if [ $x -eq 0 ]
	then
		echo "Employee Details..."
		echo "Employee ID : $empid"
		echo "Employee Name : $name"
		echo "City : $city"
		echo "Age : $age"
		echo "Position : $pos"
	fi
	if [ $x -eq 1 ]
	then
		echo "Employee does not exist!"
	fi
}

display()
{
	while read -r line;
	do
		empid=$(echo "$line" | cut -d ' ' -f 1)
		name=$(echo "$line" | cut -d ' ' -f 2)
		city=$(echo "$line" | cut -d ' ' -f 3)
		age=$(echo "$line" | cut -d ' ' -f 4)
		pos=$(echo "$line" | cut -d ' ' -f 5)
		echo "Employee Information..."
		echo "Employee ID : $empid"
		echo "Employee Name : $name"
		echo "City : $city"
		echo "Age : $age"
		echo "Position : $pos"
		echo "--------------------------------------------"
	done < "emp.txt"
}

insert()
{
	id=$(( $id + 1 ))
	echo "Enter Employee Name : "
	read name
	echo "Enter City : "
	read city
	echo "Enter Age : "
	read age
	echo "Enter Position : "
	read pos
	echo "$id $name $city $age $pos\n">>"emp.txt"
	echo "Record Inserted! Your ID is $id"
}

delete()
{
	echo "Enter Employee ID to delete : "
	read empid
	x=0
	while read -r line;
	do
		tmpid=$(echo "$line" | cut -d ' ' -f 1)
		name=$(echo "$line" | cut -d ' ' -f 2)
		city=$(echo "$line" | cut -d ' ' -f 3)
		age=$(echo "$line" | cut -d ' ' -f 4)
		pos=$(echo "$line" | cut -d ' ' -f 5)
		if [ $empid -eq $tmpid ]
		then
			x=1
		fi
		if [ $empid -ne $tmpid ]
		then
			echo "$tmpid $name $city $age $pos\n" > "emp.txt"
			if [ $x -eq 1 ]
			then
				x=1
			fi
			if [ $x -eq 0 ]
			then
				x=0
			fi
		fi
	done < "emp.txt"
	if [ $x -eq 0 ]
	then
		echo "Employee does not exist!"
	fi
	if [ $x -eq 1 ]
	then
		echo "Employee Deleted!"
	fi
}

echo "Employee Information"
var=1
while [ $var -eq 1 ]
do
	echo "1. Display"
	echo "2. Search"
	echo "3. Insert"
	echo "4. Delete"
	read choice
	case $choice in
		1) display
			;;
		2) search
			;;
		3) insert
			;;
		4) delete
			;;
	esac
	if [ $var -eq 1 ]
	then
		echo "Want to continue? Enter 1 else 0 : "
		read var
	fi
done
