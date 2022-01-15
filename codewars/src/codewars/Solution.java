package codewars;

public class Solution {

	public static void main(String[] args) {
//		System.out.println(solution(10));
//	System.out.println(makeComplement("ATCTAR"));
		
//		MiddleChar m = new MiddleChar();
//		System.out.println(m.getMiddle("AERO"));
		int[] arr = {0,160, 3, 1719, 19, 11, 13, -21};
		EvenOddArray eo = new EvenOddArray();
		System.out.println(eo.find(arr));
	}
	
	  public static int solution(int number) {
		   int count = 0;
		    for(int i=0; i<number; i++)
		      {     
		      if(i%3 ==0 || i%5 == 0) {
		    	  count += i;
		          }
		      } return count;
		  }
	  
	  public static String makeComplement(String dna) {
		    String replace= dna.replace('A','T');
		    String replace1= replace.replace('C', 'G');
		    System.out.println("After replacing String is"+replace1);
//		    str.replace('T','A');
//		    str.replace('C','G');
//		    str.replace('G','C');
		    return replace1;
		    
		  }
}
