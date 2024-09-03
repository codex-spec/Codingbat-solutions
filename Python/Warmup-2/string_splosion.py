# Given a non-empty string like "Code" return 
#a string like "CCoCodCode".


# string_splosion('Code') → 'CCoCodCode'
# string_splosion('abc') → 'aababc'
# string_splosion('ab') → 'aab'

def string_splosion(str):
  res = ""
  for i in range(len(str)+1):
    for j in range(0, i):
      res += str[j]
      
  return res
