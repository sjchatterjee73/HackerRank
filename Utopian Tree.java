//url: https://www.hackerrank.com/challenges/utopian-tree/problem?isFullScreen=false

static int utopianTree(int n) {
            int count = 1;
            for(int i=1; i<=n; i++){
                if(i %2 != 0)
                    count+= count;
                else
                    count += 1;
            }
            return count;

    }
