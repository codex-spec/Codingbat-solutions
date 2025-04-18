// Given 3 int values, a b c, return their sum. 
// However, if one of the values is the same as 
// another of the values, it does not count towards the sum.


// loneSum(1, 2, 3) → 6
// loneSum(3, 2, 3) → 2
// loneSum(3, 3, 3) → 0

public int loneSum(int a, int b, int c) {
  if(a != b && b != c && a != c) {
    return a+b+c;
  }
  else if(a != b && b == c) {
    return a;
  }
  else if(a == b && c != a) {
    return c;
  }
  else if(a == c && b != a) {
    return b;
  }
  else if(a == b && b == c) {
    return 0;
  }
  return 0;
}
