package lesson11OOP_Ex;

public class User extends bank{
	 int banknum;
     String name;
     int age;
     long id;
     
     public void toPay() {
    	 System.out.println("user is paying the bill");
     }
    public String toString(User user) {
    	String str=(user.name+user.age);
    	return str;
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public User(int banknum,String name, int age, long id) {
		this.banknum=super.num;
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public User(String name) {
		super(name);
		
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
     
}
