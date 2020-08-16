echo "Enter filename : "
read filename
count=0

#to count the number of lines in a file without using wc

while read -r line;
do
	count=`echo "$count + 1 " | bc`
done < $filename

echo "The number of lines in the file are $count"

#to count the number of words from a file without using wc
wcount=0
while read -r line;
do
	for word in $line
	do
		wcount=`echo "$wcount + 1 " | bc`
	done
done < $filename

echo "The number of words in this file are $wcount"



