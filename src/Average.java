import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter 8 numbers");

int [] numbers = new int [8];

for (int i=0; i<=numbers.length-1; i++){
	numbers[i] = scanner.nextInt();
}

int sum = (numbers[0] + numbers[1] + numbers[2]+ numbers[3]+ numbers[4]+ numbers[5]+ numbers[6]+ numbers[7])/8;
System.out.println(sum);
	}

}
