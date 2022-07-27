package webdriverExamples;

public class TC_BreakContinue {
	static int i;
	public static void main(String[] args) {
		for(i=10;i<=16;i++) {
			if (i==13)
			//	break;
				continue;
			System.out.println(i);
			
		}
	}

}
