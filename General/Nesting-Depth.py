# s = "(hello)"
# print(s.strip("()"))
def char_to_int(c):
  return int(c)

t = int(input())
for i in range(t):
  s = input()
  l = list(s)
  
  if int(s) == 0:
    print("Case #"+str(i+1)+str(": ")+s)
  
  else:
    final = ""
    index = -1
    for val in l:
      index += 1
      s = val
      for j in range(0,char_to_int(val)):
        s ="("+s+")"
      
      if index !=0:
        pre = int(l[index-1])
        val = int(val)
        if pre<=val and pre!=0:
          final = final.strip(")")
          s = s[pre:]
          final += s
        
        elif pre<=val and pre == 0:
          final +=s
        elif pre>val and val == 0:
          final +=s
        elif pre>val and val !=0:
          s = s.strip("(")
          final = final[0:-val]
          final += s

      else:
        final += s;

    print("Case #"+str(i+1)+str(": ")+final)
