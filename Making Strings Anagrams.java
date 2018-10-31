/*
url: https://www.hackerrank.com/challenges/making-anagrams/problem?isFullScreen=false&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
*/
static int makingAnagrams(String s1, String s2) {               
    int flag = s1.length() + s2.length();
    char [] first = s1.toCharArray();
    char [] second = s2.toCharArray();
    Arrays.sort(first);
    Arrays.sort(second);
    int count=0;
    for(int i=0,j=0; i<first.length; i++){        
        for(j=0; j<second.length; j++){            
            if(first[i] == second[j]){
                second[j] = '-';
                count += 2;
                break;
            }
        }
    }
    return flag - count;
}