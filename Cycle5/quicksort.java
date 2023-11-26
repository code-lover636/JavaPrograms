import java.util.Arrays;

class HelloWorld {
    
    static void swap(String arr[], int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int partition(String arr[], int low, int high){
        String pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j].compareTo(pivot)<0){
                swap(arr, ++i, j);
            }
        }
        
        swap(arr, ++i, high);
        return i;
    }
    
    static void quickSort(String arr[], int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
    
    public static void main(String[] args) {
        String arr[] = {"Aravind","Zack", "Belamy", "Octavia", "Clark"};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
    
}
