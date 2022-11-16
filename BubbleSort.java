
package bubblesort;

public class BubbleSort {
	

	public static void main(String[] args) {
		int number[]= {8,5,3,2,9};
		            //0 1 2 3 4
		int temp;
		boolean fixed=false;
		
		while(fixed==false) {
			
			fixed=true;
			
			for(int a=0; a<number.length-1 ; a++){
				
				if(number[a] > number[a+1]) {
					//if 8 > 5
					temp = number[a+1];
					//store 5 in tempt
					number[a+1]=number[a];
					//put the 8 in 5's place
					number[a]=temp;
					fixed=false;
				}
			}
	     	}
             for(int a=0; a<number.length; a++) {
            	 System.out.println(number[a]);
		}
			


		}

	}

