//url: https://www.hackerrank.com/challenges/missing-numbers/problem
static boolean isSame(int number, int freq, int [] array){
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == -8733)
                continue;
            if(number == array[i]){
                array[i] = -8733;
                count++;
            }
        }
        if(count == freq)
            return true;

        return false;
    }
    static int[] missingNumbers(int[] arr, int[] brr) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            
            for(int i=0; i<arr.length; i++){
                if(map.containsKey(arr[i]))
                    map.put(arr[i], map.get(arr[i])+1);
                else
                    map.put(arr[i], 1);
            }

            ArrayList<Integer> list = new ArrayList<Integer>();
            Arrays.sort(brr);

            for(Map.Entry temp : map.entrySet()){
                int number = (Integer)temp.getKey();
                int freq = (Integer)temp.getValue();

                if(!isSame(number, freq, brr))
                    list.add(number);
            }
            for(int i=0; i<brr.length; i++){
                if(brr[i] != -8733)
                    list.add(brr[i]);
            }
            int [] array = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                array[i] = list.get(i);
            }
            Arrays.sort(array);
            return array;
    }
