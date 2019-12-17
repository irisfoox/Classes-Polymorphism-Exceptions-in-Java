package lesson11OOP_Ex;

public class bank {
     int num;
     String name;
     public void toPay() {
    	 System.out.println("I'm paying");
     }
	public bank(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public bank(String name) {
		this.name=name;
	}
	public bank() {
		// TODO Auto-generated constructor stub
	}
     
}
