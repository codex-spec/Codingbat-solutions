
// Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.


// countEvens([2, 1, 2, 3, 4]) → 3
// countEvens([2, 2, 0]) → 3
// countEvens([1, 3, 5]) → 0

public int countEvens(int[] nums) {
  int c = 0;
  for(Integer i : nums) {
    if(i%2 == 0) {
      c++;
    }  
  }
  return c;
}
