echo "Enter a number : "
read num
sum=0 
while [ $num -gt 0 ]
do
	d=`echo "$num % 10" | bc`
	sum=`echo "$sum * 10 + $d" | bc`
	num=`echo "$num / 10" | bc`
done
echo $sum
