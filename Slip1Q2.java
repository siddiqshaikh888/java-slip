class Slip1Q2{
private int num;
Slip1Q2(int num){
this.num=num;
}
void isPositive(){
if(num>0){
System.out.println("Positive");
}}
void isNegative(){
if(num<0){
System.out.println("Negative");
}}
void isOdd(){
if(num%2!=0){
System.out.println("Odd");
}}
void isEven(){
if(num%2==0){
System.out.println("Even");
}}
public static void main(String args[]){
int num  = Integer.parseInt(args[0]);
Slip1Q2 obj = new Slip1Q2(num);
obj.isPositive();
obj.isNegative();
obj.isOdd();
obj.isEven();
}
}