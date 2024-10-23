// Given three ints, a b c, return true if one 
// of b or c is "close" (differing from a by at most 1), 
// while the other is "far", differing from both 
// other values by 2 or more. Note: Math.abs(num) 
// computes the absolute value of a number.


// closeFar(1, 2, 10) → true
// closeFar(1, 2, 3) → false
// closeFar(4, 1, 3) → true

public boolean closeFar(int a, int b, int c) {
  int checkBA = Math.abs(a-b), checkCA = Math.abs(a-c), checkBC = Math.abs(c-b), 
  checkCB = Math.abs(b-c);
  
  
  // if(checkBA <= 1 && checkCA > 1) {
  //   if(checkCA >= 2 && checkCB >= 2) {
  //     return true;
  //   }else {
  //     return false;
  //   }
  // }else if(checkCA <= 1 && checkBA > 1) {
  //   if(checkBA >= 2 && checkBC >= 2) {
  //     return true;
  //   }else {
  //     return false;
  //   }
  // }
  // return false;
  
return (checkBA <= 1 && checkCA > 1) ? ((checkCA >= 2 && checkCB >= 2) ? true : false) 
: ((checkCA <= 1 && checkBA > 1) ? ((checkBA >= 2 && checkBC >= 2) ? true : false) : false);
}
