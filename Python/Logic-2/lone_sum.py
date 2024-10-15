# Given 3 int values, a b c, return their sum. 
# However, if one of the values is the same as 
# another of the values, it does not count towards the sum.

# lone_sum(1, 2, 3) → 6
# lone_sum(3, 2, 3) → 2
# lone_sum(3, 3, 3) → 0
def lone_sum(a, b, c):
  if(a != b and b != c and a != c):
    return a+b+c
  elif(a != b and b == c):
    return a
  elif(a == b and c != a):
    return c
  elif(a == c and b != a):
    return b
  elif(a ==b and b == c):
    return 0
