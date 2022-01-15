package codewars;

public class MiddleChar {

	
	public String getMiddle(String word) {
//		  String middle = "";
//		  StringBuffer sb = new StringBuffer();
//		  if(word.length() % 2 ==0){
//		  sb.append(word.subSequence(word.length()/2-1, word.length()/2+1));
//		  System.out.println("even middle char"+sb);
//		  middle = sb.toString();
//		  }else{
//		  char c = word.charAt(word.length()/2);
//		  middle = Character.toString(c);
//		  }
//
//		  return middle;
		
/*		String middle = (word.length() % 2 != 0)? String.valueOf(word.charAt(word.length()/2)) : word.substring(word.length()/2-1, word.length()/2+1);
		
return middle;
	*/	 
		
		//AERO
		
		int n = word.length() - 1;
		return word.substring((n/2),(n/2+1+n%2));
	}
}
