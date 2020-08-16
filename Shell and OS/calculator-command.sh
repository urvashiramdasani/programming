#echo "Enter two numbers : "
#read num1
#read num2

#echo "Enter your operation : "
#echo "1. Addition"
#echo "2. Subtraction"
#echo "3. Multiplication"
#echo "4. Division"
#read ch

case $3 in
	1) res= echo $1+$2 | bc
	;;
	2) res= echo $1-$2 | bc
	;;
	3) res= echo $2*$1 | bc
	;;
	4) res= echo $1/$2 | bc
	;;
esac
echo $res