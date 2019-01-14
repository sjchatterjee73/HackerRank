
// url: https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
static int myFunc(int [] array, int i, int len, int count){
        if(i == len || i+2 == len || i+1 == len)
            return count;
        
        if(array[i+2] == 0)
        {
            count += 1;
            return myFunc(array, i+2, len, count);
        }

        if(array[i+1] == 0)
        {
            count += 1;
            return myFunc(array, i+1, len, count);
        }

        return 0;
    }
    static int jumpingOnClouds(int[] c) {
            return myFunc(c, 0, c.length-1, 1);
    }
