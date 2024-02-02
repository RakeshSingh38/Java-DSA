import java.util.Arrays;

public class _2_4_array_Q {

    
    public static void main(String[] args) {
        int[] arr= {1,3,4,54,5,6,45};

        //  here 4 and 3 are swapped
        swap(arr,1,2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}