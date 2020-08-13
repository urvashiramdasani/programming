text = input()
s = input()

count = text.count(s)
list_s = list(s)
first_char = text.count(list_s[0])*len(list_s)
count += first_char

for i in range(1,len(list_s)):
  rest = text.count(list_s[i])*(len(list_s) + 2)

count += rest
print(count)