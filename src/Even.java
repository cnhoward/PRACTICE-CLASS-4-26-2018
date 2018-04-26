import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 5 numbers");
Scanner scanner = new Scanner(System.in);

int [] numbers = new int [5];
for (int i = 0; i<=numbers.length; i ++){
	numbers[i] = scanner.nextInt();
	if(numbers[i]%2==0){
		System.out.println("even");
}
	System.out.println(numbers[i]%2==0);
}
	}

}
