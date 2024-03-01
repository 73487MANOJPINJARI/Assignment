 class Person{
 int Age;
 float Height;
 float Weight;

 Person(int A, float H, float W)
  {
   Age = A; 
   Height = H;
   Weight = W;
  }
 Person(int AA, float HH)
 { 
   Age = AA; 
   Height = HH;
 }
 public static void main(String args[])
 {
  Person obj = new Person(12,5.4f,65.40f);
  Person obj1 = new Person(10,6.0f);
  obj.display();
  obj1.display();
 }
 void display()
 {
  System.out.println("The age of the person is :"+Age);
  System.out.println("The height of the person is :"+Height);
  System.out.println("The weight of the person is :"+Weight);
 }

  
}