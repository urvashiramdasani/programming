echo "Enter any number : "
read num
count=1
while [ $count -le $num ]
do
	tmp=$count
	tmp=`echo "$tmp % 2" | bc`
	if [ $tmp -eq 0 ]
	then
		echo "$count"
	fi
	count=`echo "$count + 1" | bc`
done	
