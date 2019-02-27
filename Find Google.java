//url: https://www.hackerrank.com/contests/find-google/challenges/find-google/submissions/code/1313124329

import java.util.*;

class FindGoogle{
        static Scanner inp = new Scanner(System.in);
        static HashMap<String, String> map = new HashMap<String, String>();
        static boolean isFound(String c){
            String s = null;
            if(c.equals("()") || c.equals("<>") || c.equals("[]"))
                s = map.get("o");
            else
                s = map.get(c);
            if(s == null) return false;
            
            String [] array = s.split("=");
             
            for(int i=0; i<array.length; i++){                    
                if(array[i].equals(c)){
                    return true;
                }
            }
            return false;                                      
        }
        static boolean isMatch(String word){
            int i = 0;
            int g = 2, o = 2, l = 1, e = 1;
            while(i < word.length()){
                if((word.charAt(i) == 'g' || word.charAt(i)=='G') && g>0){
                     if(isFound(""+'g')){
                         g--;
                     }else{
                         return false;
                     }
                }else if((word.charAt(i) == 'o' || word.charAt(i) == 'O' || word.charAt(i)== '0') && o>0){
                    if(isFound(""+'o')){
                        o--;
                    }else{
                        return false;
                    }
                }else if((word.charAt(i) =='l' || word.charAt(i) == 'L' || word.charAt(i) == 'I') && l>0){
                    if(isFound(""+'l')){
                        l--;
                    }else{
                        return false;
                    }
                }else if((word.charAt(i) == 'e' || word.charAt(i) =='E' || word.charAt(i) == '3') && e>0){
                    if(isFound(""+'e')){
                        e--;
                    }else{
                        return false;
                    }
                }else if((word.charAt(i) == '(' || word.charAt(i) == '[' || word.charAt(i) == '<') && o>0){
                    String s= ""+word.charAt(i);                    
                    s += word.charAt(++i);                      
                    if(isFound(s)){
                        o--;

                    }else{
                        return false;
                    }                        
                }else{
                    return false;
                }
                i++;
            }
            //int g = 2, o = 2, l = 1, e = 1;
            return (g== 0 && o == 0 && l == 0 && e == 0);
        }
        public static void main(String [] args){
            map.put("g", "g=G");
            map.put("o", "o=O=0=()=[]=<>");
            map.put("l", "l=L=I");
            map.put("e", "e=E=3");
            String word = inp.nextLine();
            
            System.out.println(isMatch(word) ? "True" : "False");
            
    }
}
