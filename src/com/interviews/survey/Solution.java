package com.interviews.survey;
class Solution {
    public String maxValue(String str, int x) {
        

        if(str.charAt(0)!='-'){
            StringBuilder s = new StringBuilder(str);
            int n = s.length();

            if (Integer.valueOf(x) == 0) {
                s.append(String.valueOf(x));
                return s.toString();
            }
            String k = String.valueOf(x);

            if(s.charAt(0)-48<x){
                s.insert(0,k);
                return s.toString();
            }


            for (int i = 1; i <s.length(); i++) {
                int a = Integer.valueOf(s.charAt(i))-48;


                if (a<x) {
                    s.insert(i, k);
                    return s.toString();
                }
            }
            s.insert(n, k);
            return s.toString();
        }else{
            StringBuilder s = new StringBuilder(str);

            for(int i=1; i<s.length(); i++){
                int a = Integer.valueOf(s.charAt(i))-48;

                if(a>x){
                    s.insert(i,String.valueOf(x));
                    return s.toString();
                }
            }
            s.insert(s.length(),String.valueOf(x));
            return s.toString();
        }
    }
}