import java.util.Scanner;
public class IT24103583Lab7Q1B{
public static void main(String[]args){

int sumofMarks ;
int i = 1;
Scanner scanner=new Scanner(System.in);
int[] marks = new int[4];

while (i<4){
	System.out.println("\nStudent "+i);
	System.out.print("Enter Subject Marks: ");
	marks[0] = scanner.nextInt();
	marks[1] = scanner.nextInt();
	marks[2] = scanner.nextInt();
	marks[3] = scanner.nextInt();

	i++;
	
sumofMarks= marks[0]+marks[1]+marks[2]+marks[3];
double avg = sumofMarks/4;
System.out.println("Average is : "+avg);

if(avg>75){
System.out.println("Overall Grade is : Distinction");

}else if(avg>50){
System.out.println("Overall Grade is : Credit");

}else{
System.out.println("Overall Grade is : Fail");
}
}
}
}

