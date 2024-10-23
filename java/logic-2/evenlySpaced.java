
// Given three ints, a b c, one of them is small, 
// one is medium and one is large. Return true 
// if the three values are evenly spaced, so 
// the difference between small and medium is 
// the same as the difference between medium and large.


// evenlySpaced(2, 4, 6) → true
// evenlySpaced(4, 6, 2) → true
// evenlySpaced(4, 6, 3) → false

public boolean evenlySpaced(int a, int b, int c) {
  int[] arr =  new int[3];
  arr[0] = a; arr[1] = b; arr[2] = c;
  Arrays.sort(arr);
  // for(int i = 0; i < 3; i++) {
  //   for(int j = i+1; j < 3; j++) {
  //     if(arr[i] > arr[j]) {
  //       int hold = arr[j];
  //       arr[j] = arr[i];
  //       arr[i] = hold;
  //     }
  //   }
  // }
  //because the array is sorted now the above loop is the longer way than Arrays.sort()
  //smallest = arr[0], medium = arr[1], large = arr[2]
  return (arr[1]-arr[0]) == (arr[2]-arr[1]);
}
