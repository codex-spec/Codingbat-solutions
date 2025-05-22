// Given a string, compute a new string by moving the first char to come after the next two chars, 
// so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
// Ignore any group of fewer than 3 chars at the end.

// oneTwo("abc") → "bca"
// oneTwo("tca") → "cat"
// oneTwo("tcagdo") → "catdog"

public String oneTwo(String str) {
  if(str.length() < 3) return "";
  String res = "";
  for(int i = 0; i < str.length()-2; i+=3) {
    char h = str.charAt(i), h1 = str.charAt(i+1), h2 = str.charAt(i+2);
    res += h1;
    res += h2;
    res += h;
  }
  return res;
}
