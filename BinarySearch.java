import java.util.Scanner;

public class BinarySearch {  
    int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
            if (arr[m] == x) 
                return m;  
            if (arr[m] < x) 
                l = m + 1; 
            else
                r = m - 1; 
        }  
        return -1; 
    }  
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int n_inp= sc.nextInt(); 
        int[] arr= new int[n_inp];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n_inp;i++){
            arr[i]=sc.nextInt();
        }
        int n = n_inp; 
        System.out.println("Enter the element to be searched:");
        int x = sc.nextInt(); 
        int result = ob.binarySearch(arr, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                               + "index " + result); 
    } 
}
