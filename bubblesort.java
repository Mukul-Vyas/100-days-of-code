Today's problem - bubble short
    ------------------------------------------------------------------------------------------------
public class bubblesort {
    public static void main(String[] args) {
        int [] arr={7,8,5,3,9};
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swaping
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i] + " ");
            }

        System.out.println();
    }
}
---------------------------------------------------------------------------
    OUTPUT OF CODE
    3 5 7 8 9 
