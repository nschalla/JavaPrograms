package array;

import java.util.ArrayList;

public class BasicArray {

    //linearSearch
    public static int linearSearch(int inputArray[],int length,int searchElement)
    {
        for(int index=0;index<length;index++)
        {
            if(inputArray[index]==searchElement)
                return index;

        }
        return -1;
    }
    //Largest number in array (o(n))
    public  static  int largestNumber(int inputArray[]){
        int result = inputArray[0];
        for(int index = 1; index < inputArray.length; index++)
        {
            if( result < inputArray[index] )
            {
                result = inputArray[index];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        //Fixed sized arrays
//        int [] arr = new int[10];
//        arr[0]=1;
        int [] arr1 ={1,2,3,4,5};
//        System.out.println(arr1[0]);
//        System.out.println(arr[0]);
//        //Dynamic sized arrays
//        ArrayList<String> stringArray = new ArrayList<String>();
//        stringArray.add("Ns");
//        stringArray.add("sasi");
//        stringArray.add("swetha");
//        stringArray.add("Bobby");
//        System.out.println(stringArray.toString());
//        //Operation in array-normal
//        System.out.println(BasicArray.linearSearch(arr1,arr1.length,4))   ;
        System.out.println(BasicArray.largestNumber(arr1));





    }
}
