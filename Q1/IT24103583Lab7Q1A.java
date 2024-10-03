import java.util.Scanner;
public class IT24103583Lab7Q1A {
public static void main(String[]args) {

System.out.println("Enter marks four subjects:");

int sumofMarks = 0 ;
int i = 1;
Scanner scanner=new Scanner(System.in);

while (i<5){
	System.out.print("Enter Subject Marks "+i+":");
	int marks = scanner.nextInt();
	i++;
	sumofMarks = sumofMarks+marks;
}
double avg = sumofMarks/4;
System.out.println(" \nAverage is : "+avg);

if(avg>75){
System.out.println("Overall Grade is : Distinction");

}else if(avg>50){
System.out.println("Overall Grade is : Credit");

}else{
System.out.println("Overall Grade is : Fail");
}
}
}