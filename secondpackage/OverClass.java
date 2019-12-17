package secondpackage;

public class OverClass {

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
     public boolean equals(int[] arr,int x) {
    	 Boolean isequal=false;
    	 for(int i=0;i<arr.length;i++) {
    		 if(arr[i]==x) {
    			 isequal=true;
    			 System.out.println(isequal);  //check for self
    			
    		 }
    	 }
    	 return isequal;
     }
}
