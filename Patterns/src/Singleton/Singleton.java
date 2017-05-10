package Singleton;

public class Singleton {
	private static Singleton singletonInstance =  new Singleton();
			
	private Singleton(){
	}
	
	public  static Singleton getInstance(){
		if(singletonInstance != null){
			return singletonInstance;
		}
		return  new Singleton();
	}
	
	public  void message(){
		System.out.println("I am  Singleton");
	}
	
}
