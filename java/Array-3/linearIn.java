/*
*Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. 
*The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
*
*linearIn([1, 2, 4, 6], [2, 4]) → true
*linearIn([1, 2, 4, 6], [2, 3, 4]) → false
*linearIn([1, 2, 4, 4, 6], [2, 4]) → true
*/

public boolean linearIn(int[] outer, int[] inner) {
  int c = 0, l = inner.length, sig = 0;
  for(int i = 0; i < inner.length; i++) {
    for(int j = 0; j < outer.length; j++) {
      if(outer[j] == inner[i] && sig == 0) {
        c++;
        sig = 1;
      }
    }
    sig = 0;
  }
  return (c >= l) ? true : false;
}