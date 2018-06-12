
class myMain{
	
	public static void func(){
		System.out.println("In func myMain class");
	}
	
	public static void main(String[]args){
		System.out.println("myMain");
		try{
			Class.forName("Test");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}