package FirstFile;

public class FindMaxNumber {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 4;
		int num3 = 41;
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("Max no is : "+num1);
			}else
			{
				System.out.println("Max no is : "+num3);
			}
		}else
		{
			if(num2<num3) {
				System.out.println("Max no is : "+num2);			
			}else {
				System.out.println("Max no is : "+num3);
			}
		}
		
	}

}
