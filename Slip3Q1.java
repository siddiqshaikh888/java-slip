import java.util.Scanner;
class Slip3Q1{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.print("Enter Number: ");
int num = sc.nextInt();
int sum = 0;
while(num!=0){
sum+=num%10;
num/=10;
}
System.out.println("The sum of digit is "+sum);
}
}