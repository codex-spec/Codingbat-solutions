// Given a number n, return true if n is in the range 1..10, 
// nclusive. Unless outsideMode is true, in which case returntrue if 
//the number is less or equal to 1, or greater or equal to 10.


// in1To10(5, false) → true
// in1To10(11, false) → false
// in1To10(11, true) → true


public boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode) {
    if(n <= 1 || n >= 10) {
      return true;
    }
    return false;
  }else if(n >= 1 && n <= 10) 
    return true;
    
    return false;
}
