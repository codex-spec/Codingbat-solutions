// Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
// Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


// zipZap("zipXzap") → "zpXzp"
// zipZap("zopzop") → "zpzp"
// zipZap("zzzopzop") → "zzzpzp"

public String zipZap(String str) {
  String res = "";
  if(str.length() < 3) return str;
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
      res += str.charAt(i);
      res += str.charAt(i+2);
      i+=2;
    }
    else res += str.substring(i,i+1);
  }
  return res;
}
