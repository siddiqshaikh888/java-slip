class Slip13Q1{
public static void main(String[] args){
int num1 = Integer.parseInt(args[0]);
int num2 = Integer.parseInt(args[1]);
int num3 = Integer.parseInt(args[2]);
if(num1>num2){
int temp = num1;
num1 = num2;
num2 = temp;
}
if(num2>num3){
int temp = num2;
num2 = num3;
num3 = temp;
}
if(num1>num3){
int temp = num1;
num1 = num3;
num3 = temp;
}
System.out.println(num1+" "+num2+" "+num3);
}
}