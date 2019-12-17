package secondpackage;

public class Hashvaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     User u =new User();
     u.name="moshe";
     u.age=35;
     User u1 =new User();
     u1.name="dan";
     u1.age=37;
     User u2 =new User();
     u2.name="moshe";
     u2.age=35;
     User[] arr=new User[3];
     arr[0]=u;
     arr[1]=u1;
     arr[2]=u2;
         
    	 if(!equals(arr)) {
    		 System.out.println("there's no duplicated user"); 
    	 }
        }
    	     
	public static boolean equals (User[] arr) {
    	 Boolean isequal=false;
    	 int j=0;
    	 try {
    	 for(int i=0;i<arr.length;i++) {	 
   		 if((arr[i].name.equalsIgnoreCase(arr[j].name)) && (arr[i].age==arr[j].age)){
   			 if(i!=j) {
    			 isequal=true;
    			// System.out.println(isequal);//check for self
        	    //arr[j].name=" "; //optional-override duplicate user
        		 System.out.println(String.format("duplicated user:  %s  aged: %d",arr[i].name,arr[i].age));
   		         }
    	 }
    	 }
    	 }catch (NullPointerException ex) {
    		 ex.printStackTrace();
    		 System.out.println("Null exception : "+ex);
    	 }
    	 catch (Exception ex) {System.out.println("Exception: "+ex);
    	 
    	 }
		return isequal;
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
    
}
