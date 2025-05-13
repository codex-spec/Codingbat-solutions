// Given a string, does "xyz" appear in the middle of the string? To define middle, 
// we'll say that the number of chars to the left and right of \
// the "xyz" must differ by at most one. This problem is harder than it looks.

// xyzMiddle("AAxyzBB") → true
// xyzMiddle("AxyzBB") → true
// xyzMiddle("AxyzBBB") → false

public boolean xyzMiddle(String str) {
  if(str.length() < 3) return false;
  int l = str.length()/2;
  for(int i = 0; i < str.length()-2; i++) {
    if(str.substring(i,i+3).equals("xyz") && (i == l || i == l-1 || i == l+1
    || i == l-2 || i == l+2 )) {
      String res1 = str.substring(0, i), 
      res2 = str.substring(i+3, str.length());
      return Math.abs(res2.length()-res1.length()) <= 1;
    }
  }
  return false;
}
