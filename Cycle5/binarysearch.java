import java.util.Arrays;

class HelloWorld {
    static int binarySearch(int arr[], int l, int r, int key){
        int mid = (l+r)/2;
        if(l<=r){
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                return binarySearch(arr, l, mid-1, key);
            else if(arr[mid]<key)
                return binarySearch(arr, mid+1, r, key);
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 10, 20, 50,100};
        int key = 5;
        int index = binarySearch(arr, 0, arr.length - 1, key);

        if(index==-1)
            System.out.println(key+" is not in array.");
        else
            System.out.println(key+" is present at index: "+index);
    }
    
}
