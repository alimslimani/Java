package com.highfi.sys.codingame;

public class SumRange {

    public static void main(String[] args) {
        int[] ints ={1,20,3,10,-2,100};
        int res = sumRange(ints);
        System.out.println(res);
    }

    private static int sumRange(int[] ints) {
        int sum=0;
        if(ints.length>0){
            for(int i=0;i<ints.length;i++){
                int n = ints[i];
                if(n>=10 || n<=100){
                    sum+=n;
                }
            }
        }
        return sum;
    }
}
