echo "Enter file t be read : "
read filename
echo "Enter the number of lines to be read : "
read num
lcount=$(wc -l < $filename)
echo "$lcount"
count=1
while read -r line;
do
	tmp=`echo "$lcount - $count" | bc`
	if [ $tmp -lt $num ]
	then
		echo "$line"
	fi	
	count=`echo "$count + 1" | bc`
done < $filename

