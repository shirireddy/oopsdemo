
public class PatternStar {

	public static void main(String[] args) {
		int rows=5;
//upper pyramid
		for(int i=1;i<=5;i++) {

			for(int j=1;j<=rows-i;j++){
				System.out.print(" ");
			}

		for(int star=1;star<=(2*i)-1;star++){
			System.out.print("*");
			}
			System.out.println();
		} //upper pyramid
		int space=0;
		int starLimiter=4;
		//lower pyramid
		for(int i=1;i<=4;i++) {
			space=i;
			for(int j=space;j>=1;j--) {
				System.out.print(" ");
			}
			for(int star=(2*starLimiter)-1;star>=1;star--) {
				System.out.print("*");
			}
			starLimiter--;
			System.out.println();
		}
		//lower pyramid
	
	}

}
