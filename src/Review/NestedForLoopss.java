package Review;

public class NestedForLoopss {

	public static void main(String[] args) {


		for (int i = 0; i < 2; i++) {
			System.out.println("*********************outer*********************");
			for (int j = 0; j < 2; j++) {
				System.out.println("************first inner************");
				for (int k = 0; k < 2; k++) {
					System.out.println("*****2nd inner*****");
				}
			}
		}
	}

}
