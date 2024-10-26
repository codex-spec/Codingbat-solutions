// Start with two arrays of strings, a and b, each in 
// alphabetical order, possibly with duplicates. 
// Return the count of the number of strings which 
// appear in both arrays. The best "linear" 
// solution makes a single pass over both arrays, 
// taking advantage of the fact that they are in 
// alphabetical order.


// commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
// commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
// commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3

public int commonTwo(String[] a, String[] b) {
  HashMap<String, Integer> m = new HashMap<String, Integer>();
  
  String[] shorterArr = (a.length == Math.min(a.length, b.length)) ? a : b,
  longerArr = (shorterArr == a) ? b : a;
  
  for(int i = 0; i < shorterArr.length; i++) {
    for(int j = 0; j < longerArr.length; j++) {
      if(shorterArr[i] == longerArr[j] && !m.containsKey(shorterArr[i]) ) 
           m.put(shorterArr[i], 1);        
      }
    }
    
  return m.size();
}
