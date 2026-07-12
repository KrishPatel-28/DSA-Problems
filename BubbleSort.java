public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr, arr.length, 0);
        for(int i : arr){
            System.out.println(i);
        }
    }
    static void bubbleSort(int arr[], int len, int counter){
        if(len == 1){
            return;
        }
        if(counter == len - 1){
            bubbleSort(arr, len-1, 0);
            return;
        }
        if(arr[counter] > arr[counter+1]){
            int temp = arr[counter];
            arr[counter] = arr[counter+1];
            arr[counter+1] = temp;
        }
        bubbleSort(arr, len, counter+1);
        
    }
}
