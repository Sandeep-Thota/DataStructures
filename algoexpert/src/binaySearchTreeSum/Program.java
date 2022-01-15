package binaySearchTreeSum;

class Program {
  public static int findClosestValueInBst(Node tree, int target) {
   return findClosestValueInBst(tree,target, Double.MAX_VALUE);
	}
		
		public static int findClosestValueInBst(Node tree,int target,double closestValue){
			if(Math.abs(target-closestValue)>Math.abs(target-tree.value)){
				closestValue=tree.value;
			}
			if(tree.value > target && tree.left != null){
			return	findClosestValueInBst(tree.left,target,closestValue);
			}else if(tree.value < target && tree.right != null){
				return findClosestValueInBst(tree.right,target,closestValue);
			}else{
				return (int)closestValue;
			}	
		}
  

 
}
