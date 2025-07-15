// Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


// mixString("abc", "xyz") → "axbycz"
// mixString("Hi", "There") → "HTihere"
// mixString("xxxx", "There") → "xTxhxexre"

public String mixString(String a, String b) {
  String res = "";
  String ls = a.length() > b.length() ? a : b;
  for(int i = 0; i < ls.length(); i++) {
    if(i < a.length() && i < b.length()) {
      res += a.substring(i,i+1);
      res += b.substring(i,i+1);
    }else if(i < a.length()) {
      res += a.substring(i,i+1);
    }else {
      res += b.substring(i,i+1);
    }
  }
  return res;
}
