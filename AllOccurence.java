package BinarySearch;

public class AllOccurence {
    public static void main(String[] args) {

        int[]arr={10,20,20,20,20,30,40,50};
        int k=20;
        int fo=firstOcc(arr,k );
        int la=LasttOcc(arr, k);

        int AllOccu=la-fo+1;
        System.out.println(AllOccu);
        
    }

    public static int firstOcc(int[]arr,int k){
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(k==arr[mid]){
                ans=mid;
                end=mid-1;

            }else if(k>arr[mid]){
                start=mid+1;

            }else if(k<arr[mid]){
                end=mid-1;
            }
        }
        return ans;
        
    }

     public static int LasttOcc(int[]arr,int k){
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(k==arr[mid]){
                ans=mid;
                start=mid+1;

            }else if(k>arr[mid]){
                start=mid+1;

            }else if(k<arr[mid]){
                end=mid-1;
            }
        }
        return ans;
        
    }
    
}
