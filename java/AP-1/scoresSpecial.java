// Given two arrays, A and B, of non-negative int scores. 
// A "special" score is one which is a multiple of 10, 
// such as 40 or 90. Return the sum of largest special 
// score in A and the largest special score in B. 
// To practice decomposition, write a separate helper
// method which finds the largest special score in an array. 
// Write your helper method after your scoresSpecial()
// method in the JavaBat text area.


// scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
// scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
// scoresSpecial([12, 11, 4], [2, 20, 31]) → 20

public int scoresSpecial(int[] a, int[] b) {
  return findLargest(a)+findLargest(b);
}

int findLargest(int[] sa) {
  int max = 0;
  for(int j = 0; j < sa.length; j++) {
    if(sa[j] % 10 == 0 && sa[j] > max) 
        max = sa[j];
  }
  return max;
}

