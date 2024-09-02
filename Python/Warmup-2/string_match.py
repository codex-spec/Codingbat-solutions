#Given 2 strings, a and b, return the number of the positions where they contain
#the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" 
#substrings appear in the same place in both strings.

#string_match('xxcaazz', 'xxbaaz') → 3
#string_match('abc', 'abc') → 2
#string_match('abc', 'axc') → 0

def string_match(a, b):
  l = min(len(a), len(b))
  c = 0

  for i in range(l-1):
      if(a[i:i+2] == b[i:i+2]):
        c = c + 1
  return c
