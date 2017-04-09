package General;

public class LinkedListNode {

	private int data;
	private LinkedListNode next;
	public LinkedListNode(int data,LinkedListNode next)
	{
		this.data=data;
		this.next=next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkedListNode getNext() {
		return next;
	}
	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	public String printForward() {
		if (next != null) {
			return data + "->" + next.printForward();
		} else {
			return ((Integer) data).toString();
		}
	}
}
