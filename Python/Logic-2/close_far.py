# Given three ints, a b c, return True if one of b or c 
# is "close" (differing from a by at most 1), while 
# the other is "far", differing from both other 
# values by 2 or more. Note: abs(num) computes 
# the absolute value of a number.


# close_far(1, 2, 10) → True
# close_far(1, 2, 3) → False
# close_far(4, 1, 3) → True
def close_far(a, b, c):
  checkBA = abs(a-b) 
  checkCA = abs(a-c) 
  checkBC = abs(c-b) 
  checkCB = abs(b-c)
  
  if(checkBA <= 1 and checkCA > 1):
    if(checkCA >= 2 and checkCB >= 2):
      return True
    else:
      return False
  elif(checkCA <= 1 and checkBA > 1):
    if(checkBA >= 2 and checkBC >= 2):
      return True
    else:
      return False
  return False;
  
