echo "Enter two numbers : "
read num1
read num2

echo "Enter your operation : "
echo "1. Addition"
echo "2. Subtraction"
echo "3. Multiplication"
echo "4. Division"
read ch

case $ch in
	1) res= echo $num1+$num2 | bc
	;;
	2) res= echo $num1-$num2 | bc
	;;
	3) res= echo $num2*$num1 | bc
	;;
	4) res= echo $num1/$num2 | bc
	;;
esac
echo $res