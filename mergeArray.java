package com.company;

public class mergeArray {
    public static void main(String [] args){
        int [] a={22,56,32};
        int [] b={32,78,96,34,85};
        int a1=a.length;
        int b1=b.length;
        int c1=a1+b1;

        int [] c =new int[c1];

        for (int i=0; i<a1; i++){
            c[i]=a[i];
        }
        for (int j=0; j<b1; j++){
            c[a1+j]=b[j];
        }
        for(int i=0; i<c1; i++){
            System.out.println(c[i]);
        }


    }
}
