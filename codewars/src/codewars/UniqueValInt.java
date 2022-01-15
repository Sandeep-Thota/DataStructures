package codewars;

import java.util.HashMap;
import java.util.Map;
public class UniqueValInt {

	public void  findUniq(double arr[]) {
//		  int i=0;
//		  double temp = 0;
//		  
//		  while(i< arr.length-2){
//		 
//		 if(arr[i] == arr[i+1]){
//		    temp= arr[i];
//		  }
//		  else if(arr[i+1] != arr[i+2]){
//		      if(temp == arr[i+1]){
//		      return arr[i+2];
//		      }else{
//		      return arr[i+1];
//		      }
//		  }
//
//		i++;
//		}
	
		
//  int i=0;
//  
//  while(i< arr.length){
//  
//  if(arr[i] != arr[i+1]){
//  if(arr[i+1] != arr[i+2]){
//  return arr[i+1];
//  }
//  else{
//  return arr[i];
//  
// }
//  }i++;
//  
//  
//  }return -1;
		
//		double temp = 0;
//		
//		int i=0;
//		if(arr[i] == arr[i+1]) {
//			temp = arr[i];
//		}
//		while(i<arr.length) {
//		if(arr[i+1] != arr[i+2]) {
//			return arr[i+2];
//		}
//		
//		}
		
		
		 int k=0;
		  double temp = 0;
		  
		  while(k< arr.length-2){
		 
		 if(arr[k] == arr[k+1]){
		    temp= arr[k];
		  }
		        for(int i = 0; i < arr.length; i++) {  
		            for(int j = i + 1; j < arr.length; j++) {  
		                if(arr[i] != arr[j]) {
		                if(temp == arr[i]){
		                return arr[j];
		                }
		                else{
		                return arr[i];
		                 }   
		            }  
		            }
	}
}
	}
}
