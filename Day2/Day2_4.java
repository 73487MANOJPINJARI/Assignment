 class Vehicle{
 float price;
 String model;
 String colour;

  Vehicle(float P, String M, String C)
 {
  price = P;
  model = M;
  colour = C;
 }

 public static void main(String args[])
 {
  Vehicle obj = new Vehicle(5000.0f,"Honda" , " Grey");
  obj.display();
 }
 void display()
 {
  System.out.println("price of the vehicle" +price);
  System.out.println("model of the vehicle" +model);
  System.out.println("colour of the vehicle" +colour);
 }

}