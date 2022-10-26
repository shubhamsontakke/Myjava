package arrayTest2;

public class AlternativePositiveNeg {
	static void rearrange(int arr[], int n)
    {
        int i = 0, j = n - 1;
 
        while (i < j) {
            while (i <= n - 1 && arr[i] > 0)
                i += 1;
            while (j >= 0 && arr[j] < 0)
                j -= 1;
            if (i < j)
                swap(arr, i, j);
        }
 
        if (i == 0 || i == n)
            return;
 
       
        int k = 0;
        while (k < n && i < n) {
            
            swap(arr, k, i);
            i = i + 1;
            k = k + 2;
        }
    }
 
   
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
 
    static void swap(int arr[], int index1, int index2)
    {
        int c = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = c;
    }
 
   
    public static void main(String[] args)
    {
        int arr[] = { 1,2,3,-4,-1,4};
 
        int n = arr.length;
 
        System.out.println("Given array is ");
        printArray(arr, n);
 
        rearrange(arr, n);
 
        System.out.println("Rearranged array is ");
        printArray(arr, n);
    }
}
 



