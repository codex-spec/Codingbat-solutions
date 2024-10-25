// Given a string and a non-empty substring sub, compute 
// recursively the largest substring which starts and 
// ends with sub and return its length.


// strDist("catcowcat", "cat") → 9
// strDist("catcowcat", "cow") → 3
// strDist("cccatcowcatxx", "cat") → 9

public int strDist(String str, String sub) {
  int stLen = str.length();
	int sbLen = sub.length();
	if(stLen < sbLen)
		return 0;
	if(str.substring(0, sbLen).equals(sub))
	{
		if(str.substring(stLen - sbLen, stLen).equals(sub))
			return stLen;
		return strDist(str.substring(0, stLen - 1), sub);
	}
	return strDist(str.substring(1), sub);
}
