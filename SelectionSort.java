public class SelectionSort {
public static void main(String[] args) {
	int arr[] = {8, 4, 5, 3, 1, 7, 2, 6, 3};
	selectionSort(arr);
    printArr (arr);
}
public static void selectionSort (int arr[]) {
		for (int a = 0; a < arr.length -1; a++) {
			int miniPos =a;
			for (int b =a+1; b< arr.length; b++) {
				if (arr[miniPos]> arr[b]) {
					miniPos =b;
				}
			}
			int temp = arr[miniPos];
			arr[miniPos]= arr[a];
			arr [a] = temp;
		}
		
}
public static void printArr(int arr[]){
	for (int a = 0; a< arr.length; a++){
		System.out.println(arr[a]+ " ");
	}
	System.out.println();

				}
			}