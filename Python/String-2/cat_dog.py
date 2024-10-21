# Return True if the string "cat" and "dog" appear 
# the same number of times in the given string.


# cat_dog('catdog') → True
# cat_dog('catcat') → False
# cat_dog('1cat1cadodog') → True
def cat_dog(str):
  cc = 0
  dc = 0
  for i in range(len(str)-2):
    if str[i:i+3] == "cat":
      cc = cc+1
    elif str[i:i+3] == "dog":
      dc=dc+1
  return True if cc == dc else False
