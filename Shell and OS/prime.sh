for i in {2..100}
do
for (( j=2; j<i; j++ ))
	do
		flag=0
		if [ $(($i % $j)) -eq 0 ]
		then
			flag=1
			break
		fi
	done
	if [ $flag -eq 0 ]
	then
		echo $i
	fi
done

