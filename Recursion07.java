import java.util.Scanner;
class Recursion07{
	public static void reverse(int arr[], int start, int end){
		if(start >= end)
			return;
		int temp;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		reverse(arr, start+1, end-1);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Row Array Elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter Array Elements: ");
		int arr[] = new int[n];
		for(int i = 0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements: ");
		for(int i = 0; i<n; i++){
			System.out.println(arr[i]);
		}

		System.out.println("Reversed Array Elements: ");
		reverse(arr, 0, n-1);
		for(int i = 0; i<n; i++){
			System.out.println(arr[i]);
		}
		
	}
}