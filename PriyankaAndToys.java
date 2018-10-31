/*
Priyanka works for an international toy company that ships by container. Her task is to the determine the lowest cost way to combine her orders for shipping. She has a list of item weights. The shipping company has a requirement that all items loaded in a container must weigh less than or equal to 4 units plus the weight of the minimum weight item. All items meeting that requirement will be shipped in one container.

What is the smallest number of containers that can be contracted to ship the items based on the given list of weights?
url: https://www.hackerrank.com/challenges/priyanka-and-toys/problem?isFullScreen=false&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
*/

static int toys(int[] w) {
        int count=1;
        Arrays.sort(w);
        for(int i=0; i<w.length; i++){
            for(int j=i+1; j<w.length; j++){
                if(w[j] - w[i] <= 4){
                    continue;
                }else{
                    count++;
                    i = j;
                }
            }
        }
        return count;
    }