public int[] fix34(int[] nums) {

  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 3 ) {
      int j = i + 1;
      while(j < nums.length && nums[j] != 4)
        j++;
                            
    while(i < nums.length) {
        if(nums[i] == 3) {
            int temp = nums[i+1];
            nums[i+1] = nums[j];
            nums[j] = temp;
                                                          
            while(j < nums.length && nums[j] != 4)
                j++;
        }
        i++;
    }
      
    }
  }
  return nums;
}
