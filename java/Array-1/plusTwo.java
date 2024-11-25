
// Given 2 int arrays, each length 2, return a new array 
// length 4 containing all their elements.


// plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
// plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
// plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]

public int[] plusTwo(int[] a, int[] b) {
  int[] ar = new int[4];
  ar[0] = a[0];
  ar[1] = a[1];
  ar[2] = b[0];
  ar[3] = b[1];
  return ar;
}
