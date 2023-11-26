class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}

public class TestException{
	public static void main(String args[]) throws Exception{
		int x=5, y=1000;
		try{
			float z= (float) x/y;
			if(z<0.01){
				throw new MyException("Number too small");
			}
		}
		catch(MyException e){
			System.out.println("Caught MyException "+e.getMessage());
		}
		finally{
			System.out.println("I am always here");
		}
	}
}
