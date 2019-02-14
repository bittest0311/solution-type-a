package problem02;

public class SmartPhone extends MusicPhone {
	
	public String runApp() {
		
		return "앱 실행";
	}
	
	public void execute( String function ) {
		
		if(function.equals("통화")) {
			
			System.out.println("통화하기");
		}
		
		if(function.equals("음악")) {
			
			System.out.println("스트리밍");
			
		}
		if(function.equals("앱")) {
		
			System.out.println(runApp());
			
		}
		
		
	}
}