package lesson11OOP_Ex;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        bank bank=new bank();
        Account acc=new Account();
        User user=new User();
        bank[] b=new bank[4];  
        User moshe=new User("moshe");
        User avi=new User("avi");
        User sam=new User("samuel");
        User dan=new User("dan");
  
        b[0]=moshe; //possible because moshe is user that extends bank
        b[1]=avi;
        b[2]=sam;
        b[3]=dan;
        for(bank i:b)
        System.out.println(i.name);
	}

}
