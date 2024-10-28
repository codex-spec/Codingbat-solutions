// Given an array of ints length 3, return an array with 
// the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


// rotateLeft3([1, 2, 3]) → [2, 3, 1]
// rotateLeft3([5, 11, 9]) → [11, 9, 5]
// rotateLeft3([7, 0, 0]) → [0, 0, 7]

public int[] rotateLeft3(int[] nums) {
  int[] ar = new int[3];
  ar[0] = nums[1];
  ar[1] = nums[2];
  ar[2] = nums[0];
  return ar;
}
