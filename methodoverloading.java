package MyProject;

public class methodoverloading {
  public int sum(int a,int b){
    return a+b;
  }
  void sum(float a,float b) {
    float c=a+b;
    System.out.println(c);
  }
  void sum(int a,float b,double c) {
    double d=a+b+c;
    System.out.println(d);
  }
  public double sum(double a,double b) {
    return (a+b);
  }
  public static void main(String args[]) {
    methodoverloading ob=new methodoverloading();
    System.out.println(ob.sum(10, 20));
    ob.sum(2.5f, 3.5f);
    ob.sum(10,3.5f, 20.5);
    System.out.println(ob.sum(30.25, 60.78));
  }
}