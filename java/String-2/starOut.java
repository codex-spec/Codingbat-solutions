// Return a version of the given string, where for every star (*) in the string 
//   the star and the chars immediately to its left and right are gone. 
//   So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

// starOut("ab*cd") → "ad"
// starOut("ab**cd") → "ad"
// starOut("sm*eilly") → "silly"

public String starOut(String str) {
  String res = "";
   if(str.length() == 1 && str.charAt(0) != '*') return str;
   else if(str.length() < 1 || (str.length() == 2 && 
  (str.charAt(0) == '*' || str.charAt(1) == '*'))) return "";
  
  for(int i = 1; i < str.length()-1; i++) {
   if(str.charAt(i-1) == '*' || str.charAt(i) == '*' || str.charAt(i+1) == '*') ;
   else res += str.substring(i, i+1);
  }
  
   if(str.charAt(0) != '*' && str.charAt(1) != '*') res = str.substring(0,1) + res;
   if(str.charAt(str.length()-1) != '*' && str.charAt(str.length()-2) != '*') 
    res += str.substring(str.length()-1, str.length());
  
  return res;

}
