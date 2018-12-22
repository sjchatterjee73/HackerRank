//url: https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=false
static void extraLongFactorials(int n) {
  BigInteger t = new BigInteger("1");
  for(int i=1; i<=n; i++){
      t = t.multiply(new BigInteger(i+""));
  }
  System.out.println(t);
}
