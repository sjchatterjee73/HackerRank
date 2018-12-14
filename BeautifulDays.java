
/* url: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?h_r=next-challenge&h_v=zen&isFullScreen=false */
static int getCount(String str, int k){
        StringBuilder sb = new StringBuilder(str);

        int num = Integer.parseInt(str);
        int num1 = Integer.parseInt(String.valueOf(sb.reverse()));
        if((num - num1) % k == 0)
            return 1;
        
        return 0;
    }
    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        int temp = i;
        while(temp <= j){
            String num = ""+temp;
            count += getCount(num, k);
            temp++;
        }
        return count;
    }
