echo "Enter your text : "
read str
while [ "${str,,}" != "end" ]
do
	echo $str>>urvi.txt
	echo "Enter your text : "
       	read str
done
