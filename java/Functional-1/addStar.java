// Given a list of strings, return a list where each string has "*" added at its end.

// addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
// addStar(["hello", "there"]) → ["hello*", "there*"]
// addStar(["*"]) → ["**"]

public List<String> addStar(List<String> strings) {
  for(int i = 0; i < strings.size(); i++) {
    String r = strings.get(i);
    r = r + "*";
    strings.remove(i);
    strings.add(i, r);
  }
  return strings;
}
