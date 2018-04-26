import java.util.Scanner;

public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

System.out.println("How old are you");

int age = scanner.nextInt();
System.out.println("What is your weight?");

int weight = scanner.nextInt();

System.out.println("What is your income?");

double income = scanner.nextDouble();

if (age<18)
{
	System.out.println("The person will be added as a minor");
}
if ((age>=18)&&(age<=38)&&(weight<200)){
	System.out.println("This person is healthy");
}

if((age>38)&&(age<=58)&&(income==50000.00)){
	System.out.println("This person is at low risk");
}
if (age>58){
	System.out.println("This person is high risk");
}

	}

}
