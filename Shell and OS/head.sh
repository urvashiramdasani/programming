echo "Enter file to be read : "
read filename
echo "Enter the number of lines to be read : "
read num
count=1
while read -r line;
do
	if [ $count -gt $num ]
	then
		break
	fi
	lines=$line
	echo "$lines"
	count=`echo "$count + 1" | bc`
done < $filename
