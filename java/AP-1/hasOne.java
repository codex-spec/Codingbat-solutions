// Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.


// hasOne(10) → true
// hasOne(22) → false
// hasOne(220) → false

public boolean hasOne(int n) {
  String temp = Integer.toString(n);
  int[] tempArr = new int[temp.length()];
  for(int k = 0; k < temp.length(); k++) {
    tempArr[k] = temp.charAt(k) - '0';
  }
  
  for(int i = 0; i < tempArr.length; i++) {
    if(tempArr[i] == 1) {
      return true;
    }
  }
  return false;
  
}





