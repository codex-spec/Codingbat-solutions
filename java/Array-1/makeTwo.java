public int[] make2(int[] a, int[] b) {
  int[] res = new int[2];
  int rc = 0;
  for(Integer i : a) {
        if(rc >= 2) break;

    res[rc] = i;
    rc++;
  }
  for(Integer j : b) {
    if(rc >= 2) break;
    res[rc] = j;
    rc++;
  }
  return res;
}
