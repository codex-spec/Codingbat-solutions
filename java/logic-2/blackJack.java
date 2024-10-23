
// Given 2 int values greater than 0, return 
// whichever value is nearest to 21 without going over.
// Return 0 if they both go over.


// blackjack(19, 21) → 21
// blackjack(21, 19) → 21
// blackjack(19, 22) → 19

public int blackjack(int a, int b) {
  // if(a > 21 && b > 21) {return 0;}
  // else if(a > 21 && b < 21) return b;
  // else if(a < 21 && b > 21) return a;
  // else {
  //   int adiff = Math.abs(21-a), bdiff = Math.abs(21-b);
  //   return (adiff < bdiff) ? a : b;
  // }
  int adiff = Math.abs(21-a), bdiff = Math.abs(21-b);

  
  return (a > 21 && b > 21) ? 0 : (a > 21 && b < 21) ? b : (a < 21 && b > 21) ? a 
  : (adiff < bdiff) ? a : b;
  
}
