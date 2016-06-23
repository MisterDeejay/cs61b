public class PrintTriangle {
	public static void drawTriangle(int n) {
		int x = 0;
		int y;
		while (x <= n - 1) {
			for(y = 0; y < x; y++) {
				System.out.print("*");		
			}
			System.out.println("");
			x++;
		}
	}

	public static void main(String[] args) {
		drawTriangle(10);
	}
}