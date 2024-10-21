# Given two strings, return True if either of
# the strings appears at the very end of 
# the other string, ignoring upper/lower 
# case differences (in other words, the 
# computation should not be "case sensitive"). 
# Note: s.lower() returns the lowercase version
# of a string.


# end_other('Hiabc', 'abc') → True
# end_other('AbC', 'HiaBc') → True
# end_other('abc', 'abXabc') → True
def end_other(a, b):
  a = a.lower()
  b = b.lower()
  # shorter = a if len(a) <= len(b) else b
  # longer = b if len(b) >= len(a) else a
  # if(shorter == longer or (longer[-len(shorter):] == shorter)):
  #   return True
  # else:
  #   return False
  return (b.endswith(a) or a.endswith(b))