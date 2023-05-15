package Interfaces;

	interface firstInterface {
		public void myMethod();
		
	}
	
	interface secondInterface {
		public void myOtherMethod();
	}
	
	class DemoClass implements firstInterface, secondInterface{

		@Override
		public void myOtherMethod() {
			
			System.out.println("I am Method, From Interface");
			
		}

		
		public void myMethod() {
			System.out.println("I am Method, From second Interface");
			
		}
		
		
	}

public class Main {
	
	public static void main(String[] args) {
		
		DemoClass obj = new DemoClass();
		obj.myMethod();
		obj.myOtherMethod();
	}

}
