// Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
// You may assume that n is between 0 and the length of the string, inclusive.

// repeatEnd("Hello", 3) → "llollollo"
// repeatEnd("Hello", 2) → "lolo"
// repeatEnd("Hello", 1) → "o"

public String repeatEnd(String str, int n) {
  String res = "";
  int i = 0; 
  while(i < n) {
    res += str.substring(str.length()-n, str.length());
    i++;
  }
  return res;
}
