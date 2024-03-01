   class Student{
   String name;
   int subject1;
   int subject2;
   int subject3;

  public static void main(String args[])
  {
   Student obj = new Student();
   obj.assign("Manoj",20,30,10);
   obj.averagemarks();
   obj.display();
   
}
   void assign(String str , int maths ,int physics, int bio)
   { 
    name = str;
    subject1 = maths;
    subject2 = physics;
    subject3 = bio;
   }
   void averagemarks()
   {
    int averagemarks = (subject1 + subject2 + subject3) / 3;
    System.out.println("total average marks of manoj :"+averagemarks);
   }
   void display()
   {
    int total = subject1 + subject2 + subject3;
    System.out.println("Name of the student:"+name);
    System.out.println("total marks:"+total);
   }
}