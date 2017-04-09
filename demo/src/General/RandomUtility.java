package General;




public class RandomUtility {

	
	public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}
	
	public static int randomRange(int max,int min){
	return randomInt(max+1-min)+min;
	}
	
	
	public static LinkedListNode randomLinkedList(int number,int max,int min)
	{
		LinkedListNode root = new LinkedListNode(randomRange(max, min), null);
		LinkedListNode prev = root;
		for (int i = 1; i < number; i++) {
			
			int data = randomRange(min, max);
			LinkedListNode next = new LinkedListNode(data, null);
			prev.setNext(next);
			prev = next;
		}
		return root;
	}
	
	
}
