public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr, arr.length);
        for(int i : arr){
            System.out.println(i);
        }
    }
    static void bubbleSort(int arr[], int len){
        if(len == 1){
            return;
        }
        
        for(int i=0; i<len-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr, len-1);
    }
}
