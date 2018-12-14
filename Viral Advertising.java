
/* url: https://www.hackerrank.com/challenges/strange-advertising/problem?h_r%5B%5D%5B%5D=next-challenge&h_r%5B%5D%5B%5D=next-challenge&h_v%5B%5D%5B%5D=zen&h_v%5B%5D%5B%5D=zen&isFullScreen=false*/
static int viralAdvertising(int n) {
        int sum = 0;
        int p = 5;
        while(n-- > 0){
            p = (int) Math.floor(p/2);
            sum += p;
            p *= 3;
        }
        return sum;
    }
