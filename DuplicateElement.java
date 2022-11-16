
public class DuplicateElement {

	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5,6,3,4,7,1};
	    int len = arr.length;
	    //int temp[] = new int[arr.lenghth];
	    int a = 0;
	    
	    for(int b = 0; b < len - 1; b++) {
	    	
	    	if(arr[b] != arr[b+1]) {
	    		arr[a++] = arr[b]; //1,2,3,4,5,6
	    	}
	    }
	    
	    arr[a++] = arr[len - 1];
	    
	    for(int c = 0; c < a; c++) {
	    	System.out.println(arr[c]);
	    	
	    }

	}

}
