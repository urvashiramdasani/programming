echo "Enter a file to be read : "
read filename
count=1
#filename="data.txt"
while read -r line; 
do
	lines=$line
	if [ "$lines" == "end" ]
	then
		break
	fi
	echo $lines>>output.txt
	count=`echo "$count + 1" | bc`
done < $filename
echo "The number of lines in your file is $count"
