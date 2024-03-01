 class Box{
 int height;
 int width;
 int breadth;

  Box(int H, int W, int B)
  { 
   height = H;
   width = W;
   breadth = B;
   getvolm();
   getArea();
  } 

  public static void main(String args[]){
  Box obj = new Box(2,2,2);
  Box obj1 = new Box(5,5,5);
  }
  void getvolm()
  {
   int volm = height * width * breadth;
   System.out.println("Volume:" +volm);
  }
  void getArea()
  {
   int area = height * breadth + 2 * height * width + 2 * breadth * height;
   System.out.println("Area is :"+area);
  }
}