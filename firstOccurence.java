package BinarySearch;

public class firstOccurence {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 20, 20, 30, 40};
        int k = 20;
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == k) {
                ans = mid;
                end = mid - 1;
            } else if (k > arr[mid]) {
                start =mid + 1;
            } else if (k < arr[mid]) {
                end =mid - 1;
                
            }
           
        }
         System.out.println(ans);
    }

}
