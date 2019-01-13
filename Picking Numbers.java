//url: https://www.hackerrank.com/challenges/picking-numbers/problem
    public static int pickingNumbers(List<Integer> a) {
        Integer [] array = new Integer[a.size()];
        array = a.toArray(array);
        Arrays.sort(array);
        int count = 0;
        for(int i=0; i<array.length; i++){
            int item = array[i];
            int flag = 1;
            for(int j=i+1; j<array.length; j++){
                if(array[j] - item <= 1)
                    flag++;
                else
                    break;
            }
            if(flag > count)
                count = flag;
        }
        return count;
    }
