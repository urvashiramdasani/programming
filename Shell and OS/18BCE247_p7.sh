var=1
while [ $var -eq 1 ]
do
	echo "Enter your choice : "
	echo "1. View Present Working Directory"
	echo "2. Make New Directory"
	echo "3. Change Present Working Directory"
	echo "4. Change Permission of Directory"
	echo "5. Rename Directory"
	echo "6. Remove Direcotry"
	read choice
	case $choice in
		1) prewd=$(pwd)
			echo "$prewd"
			;;
		2) echo "Enter a Direcotry name : "
			read name
			mkdir $name
			echo "New Directory Created"
			;;
		3) echo "Enter a Directory name : "
			read dir
			cd $dir
			echo "Directory Changed!"
			;;
		4) echo "Enter directory/file name : "
			read dir
			echo "Enter the sum of corresponding numbers to give permission "
			echo "Read - 4 , Write - 2 , Executable - 1 "
			echo "Enter User Permission "
			read n1
			echo "Enter Group Permission "
			read n2
			echo "Enter Other Permission "
			read n3
			chmod $n1$n2$n3 $dir
			echo "Success!"
			;;
		5) echo "Enter directory name : "
			read name
			echo "Enter new directory name : "
			read new_name
			mv $name $new_name
			echo "Rename Successful!"
			;;
		6) echo "Enter directory name : "
			read name
			rm -r $name
			echo "Directory Removed!"
			;;

	esac
	echo "You want to continue? Press 1 else 0"
	read var
done

