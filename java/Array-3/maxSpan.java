// Consider the leftmost and righmost appearances 
// of some value in an array. We'll say that the "span" 
// is the number of elements between the two inclusive. 
// A single value has a span of 1. Returns the largest 
// span found in the given array. (Efficiency is not a priority.)

// maxSpan([1, 2, 1, 1, 3]) → 4
// maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
// maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

public int maxSpan(int[] nums) {
  int span = 0, max = 0;
  
  for(int i = 0; i < nums.length; i++) {
    for(int j = nums.length-1; j >= 0; j--) {
      if(nums[j] == nums[i]) {
        span = Math.abs(j-i)+1;
        if(span > max) {
          max = span;
        }
        break;
      }
    }
  }
  return max;
}
