# Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

# sum67([1, 2, 2]) → 5
# sum67([1, 2, 2, 6, 99, 99, 7]) → 5
# sum67([1, 1, 6, 7, 2]) → 4
def sum67(nums):
  res = 0
  sig = 0
  for i in nums:
    if i != 6 and sig == 0 :
      res = res+i
    elif i == 6:
      sig = 1
      continue
    elif i == 7 and sig == 1 :
      sig = 0
      continue
  return res
    

