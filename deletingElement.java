// #6

import java.util.Arrays;
public class deletingElement {

	static int deleteElement(int[]arr,int index )  {
		
			 int []arr = {3, 7, 1, 9, 4};
		
		 int [] newArray = new int[arr .length - 1];
		index = 2;
		for(int i = 0, j=0 ; i < arr.length;i++) {
			if(i!= index) {
				newArray[j++] = arr[i];
				
			}
		}
		for(int element:newArray) {
		System.out.println(element );	
		
	}
	}
	
}
