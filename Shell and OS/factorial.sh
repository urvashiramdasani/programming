echo "Enter a positive number : "
read num
while [ $num -lt 0 ]
do
	echo "Invalid Number! Enter Again : "
	read num
done
sum=1
while [ $num -gt 0 ]
do
	sum=$(( $sum * $num ))
	num=$(( $num - 1 ))
done
echo $sum
