package BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[]arr={70,80,90,10,20,30,40,50,60};
        int k=60;
       System.out.println(find(arr, k));
        

    }

    public static int find(int[] arr,int k){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(k==arr[mid]){
                return mid;

            }else if(arr[start]<=arr[mid]){
                if(k>=arr[start]&&k<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }else{
                if(k>arr[mid]&&k<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
