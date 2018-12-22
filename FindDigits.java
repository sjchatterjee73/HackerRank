// https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=false

static int findDigits(int n) {
    String str = ""+n;
    char [] array = str.toCharArray();
    int count = 0;

    for(int i=0; i<array.length; i++){
        int r = (int)array[i]-'0';
        if(r != 0 && (n % r == 0)){
            count++;
        }
    }
    return count;
}
