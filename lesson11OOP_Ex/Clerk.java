package lesson11OOP_Ex;

public class Clerk extends Account {
    String name;
    long id;
    public void toPay() {
    	System.out.println("the clerk approved the user's bill");
    }
	public Clerk(int num, String name, String name2, long id) {
		name = name2;
		this.id = id;
	}
    public Clerk() {
    	
    }
}
