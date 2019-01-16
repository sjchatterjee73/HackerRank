//url: https://www.hackerrank.com/challenges/the-hurdle-race/problem

int getMax(int * array, int size){
    int max = array[0];
    for(int i=1; i<size; i++){
        if(array[i] > max)
            max = array[i];
    }
    return max;
}
int hurdleRace(int k, int height_count, int* height) {
        int max = getMax(height, height_count);
        if(max > k)
            return max-k;
        
        return 0;
}
