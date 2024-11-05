
// Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


// lastTwo("coding") → "codign"
// lastTwo("cat") → "cta"
// lastTwo("ab") → "ba"

public String lastTwo(String str) {
  if(str.length() >= 3 || str.length() == 2) {
    String sl = str.substring(str.length()-2, str.length()-1), l = str.substring(str.length()-1, str.length());
    return str.substring(0, str.length()-2) + l + sl;
  }
  return str;
}
