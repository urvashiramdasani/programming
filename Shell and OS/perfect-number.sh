# Author : Urvashi Ramdasani
# Employee ID : 1450
# Linux Training Batch 1
# Write a bash script to find if a number is perfect or not

echo "Enter a number : "
read num
sum=1
i=2
while [ $(( $i * $i )) -le $num ]
do
        if [ $(( $num % $i )) -eq 0 ]
        then
                if [ $(( $i * $i)) -ne $num ]
                then
                        t=$(( $num / $i ))
                        sum=$(( $sum + $i + $t ))
                else
                        sum=$(( $sum + $i ))
                fi
        fi
        i=$(( $i + 1))
done
if [ $sum -eq $num ] && [ $num -ne 1 ]
then
        echo "The number is perfect"
else
        echo "The number is not perfect"
fi
