max_nut = input().split(" ")
max_P = int(max_nut[0][:len(max_nut[0])-1])
max_C = int(max_nut[1][:len(max_nut[1])-1])
max_F = int(max_nut[2][:len(max_nut[2])-1])
# print(max_P, max_C, max_F)

item_list = []
items = input().split("|")
for item in items:
  s = item.split(" ")
  for i in s:
    if i[-1] == 'P':
      p = int(i[:-1])
    elif i[-1] == 'C':
      c = int(i[:-1])
    elif i[-1] == 'F':
      f = int(i[:-1])
  
  item_list.append([p,c,f])

# print(item_list)

n = 1
P = C = F = 0
tmp_P = tmp_C = tmp_F = 0
while 1:
  for item in item_list:
    l = [ele*n for ele in item]
    tmp_P = tmp_P + l[0]
    tmp_C = tmp_C + l[1]
    tmp_F = tmp_F + l[2]

  if tmp_P>=max_P or tmp_C>=max_C or tmp_F>=max_F:
    break
  n = n + 1
  P = tmp_P
  C = tmp_C
  F = tmp_F
  tmp_P = tmp_C = tmp_F = 0

# print(P,C,F)

diff_P = max_P - P
diff_C = max_C - C
diff_F = max_F - F

result = [-1, -1, -1]
for item in  item_list:
  if diff_P == item[0]:
    result = [str(0), str(diff_C - item[1]), str(diff_F - item[2])]
  else:
    if diff_C == item[1] and result[0] != 0:
      result = [str(diff_P - item[0]), str(0), str(diff_F - item[2])]
    else:
      if diff_F == item[2] and result[0] != 0 and result[1] != 0:
        result = [str(diff_P - item[0]), str(diff_C - item[1]), str(0)]
      else:
        # some code here
        a = 1
        

print(" ".join(result))