class Employee{
int id;
String name;
int salary;
Employee(int id, String name, int salary){
this.id=id;
this.name=name;
this.salary=salary;
}
}
class Slip3Q2{
public static void main(String[] args){
Employee[] e = {
new Employee(1,"A",10000),
new Employee(2,"B",20000),
new Employee(3,"C",40000),
};
Employee max = e[0];
for(int i=0;i<e.length;i++){
if(max.salary<e[i].salary){
max=e[i];
}}
System.out.println(max.name);
}
}
