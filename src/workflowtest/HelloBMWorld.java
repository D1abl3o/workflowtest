package workflowtest;

public class HelloBMWorld {
	public static void main(String[] args){
		System.out.print("Hello BMWorld");
		for(int i = 0; i < 3; i++){
			System.out.println("Tralalala");
		}
		
		FeatureOneClass a = new FeatureOneClass("Test");
		a.output();
		FeatureTwoClass b = new FeatureTwoClass("2tests");
		b.output();
	}
	private String method(){
		return "Hello"+" World";
		
	}
	
	private static void test(){
		System.out.println("test");
	}
	
	static void featureMethod(){
		System.out.println("New Feature Method1");
	}

	static void featureMetod2(){
		System.out.println("Seconde feature Method");
	}
}
