import java.util.Arrays;
import java.util.List;

public class Arraysprogram {
    public static void main(String[] args){
        int[] arr={66,99,21,11,65,100,151};
        int[] arr1={1,2,3,6,5};
        List arr2=Arrays.asList(arr);
        int result=findseclargest(arr);
        int[] r=findlargeandsmall(arr);
        int[] reverse=reversearr(arr);
        int fifthval=fifthlarge(arr);
        boolean res=isSorted(arr1);

        System.out.println("Second Largest element in array:"+result);
        System.out.println("Largest and smallest in array:"+r[0]+","+r[1]);
        System.out.print("Reversed Array:"+" ");
        for(int i:reverse){
            System.out.print(i+" ");
        }
        System.out.println("\n"+"fifth highest value:"+fifthval);
        if (res) {
            System.out.print("Sorted");
        } else {
            System.out.print("Not Sorted");
        }

    }
    //find sec large element method
    public static int findseclargest(int[] arr2){
        int largest=0;
        int seclargest=0;
        for(int i:arr2){
            if(i>largest){
                seclargest=largest;
                largest=i;
            }
            else if(i>seclargest && i!=largest){
                seclargest=i;
            }
            //to find third largest
            /*else if(i>thirdlarge && i!=seclrge){
                thirdlarge=i;
            }
        }
        return thirdlarge;
    }*/
        }
        return seclargest;
    }
    //find largest and smallest in array method
    public static int[] findlargeandsmall(int[] arr){

        int small=arr[0];
        int large=arr[0];
        for(int n :arr){
            if(n>large){
                large=n;
            }
            if(n<small){
                small=n;
            }
        }
        return new int[]{large,small};
    }
    // reverse array without inbuilt menthod
    public static int[] reversearr(int[] arr){
        for(int start=0,end=arr.length-1;start<end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        return arr;
    }
//kth highest value method - replace the k in arr.length-k
   public static int fifthlarge(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-5];
    }
    public static boolean isSorted(int[]arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}