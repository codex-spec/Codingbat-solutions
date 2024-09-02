#Given a string and a non-negative int n, return a larger string that is n copies of the original string.

#string_times('Hi', 2) → 'HiHi'
#string_times('Hi', 3) → 'HiHiHi'
#string_times('Hi', 1) → 'Hi'

def string_times(str, n):
  res = ""
  for x in range(0, n):
    res += str
  return res
