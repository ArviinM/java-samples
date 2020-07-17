class SortRecursion1{
	/* Function to reverse arr[] from start to end*/
    static void rvereseArray(int arr[], int start, int end) 
    { 
        int temp; 
        if (start >= end) 
            return; 
        temp = arr[start]; 
        arr[start] = arr[end]; 
        arr[end] = temp; 
        rvereseArray(arr, start+1, end-1); 
    } 
  
    /* Utility that prints out an array on a line */
    static void printArray(int arr[], int size) 
    { 
        for (int i=0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    } 
  
    /*Driver function to check for above functions*/
    public static void main (String[] args) { 
        int arr[] = {7,10,55,100,49,60};
        printArray(arr, 6); 
        rvereseArray(arr, 0, 5); 
        System.out.println("Reversed array is "); 
        printArray(arr, 6); 
    } 
}