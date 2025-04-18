# Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


# sum13([1, 2, 2, 1]) → 6
# sum13([1, 1]) → 2
# sum13([1, 2, 2, 1, 13]) → 6
def sum13(nums):
  res = 0
  sig = 0
  for i in nums:
    if(i != 13 and sig == 0):
      res = res+i
    elif(i == 13):
      sig = 1
      continue
    else:
      sig = 0
  return res
