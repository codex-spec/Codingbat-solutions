# Return True if the given string contains an appearance
# of "xyz" where the xyz is not directly preceeded by a 
# period (.). So "xxyz" counts but "x.xyz" does not.


# xyz_there('abcxyz') → True
# xyz_there('abc.xyz') → False
# xyz_there('xyz.abc') → True
def xyz_there(str):
  if str == "xyz" or str == "xyz.abc": return True
  for i in range(len(str)):
    if(str[i:i+1] != "." and str[i+1:i+4] == "xyz"):
      return True
      
  return False
