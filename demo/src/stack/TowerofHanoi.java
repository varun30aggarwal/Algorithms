package stack;

public class TowerofHanoi {
public void solve(int n ,String start,String aux,String end)
{
	if (n==1) // base case
		System.out.println(start + "-->" + end);
	else {
		// moving from a to b using c 
		solve(n-1,start,end,aux);
		// moving a to c
	System.out.println(start + "-->"+end);
	// moving from b to c using a
	solve(n-1,aux,start,end);
}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TowerofHanoi tn= new TowerofHanoi();
 int n =3;
 tn.solve(n, "A", "B","C");

	}

}
