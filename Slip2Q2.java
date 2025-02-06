class Slip2Q2{
public static void main(String[] args){
Product[] p = {
new Product(1,"Cooler",2099),
new Product(2,"Heater",1999),
new Product(3,"Television",1499),
new Product(4,"Table",2399),
new Product(5,"Monitor",699)
};
findMin(p);
}
public static void findMin(Product[] p){
Product minPrice = p[0];
for(int i=0;i<p.length;i++){
if(minPrice.price>p[i].price){
minPrice = p[i];
}
}
System.out.println("Product with minimum price is : "+minPrice.name);
}}
class Product{
int id;
String name;
int price;
public Product(int id, String name, int price){
this.id=id;
this.name=name;
this.price=price;
}
void message(){
System.out.println(id+" "+name+" "+price);
}}