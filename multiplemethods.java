package MyProject;

public class multiplemethods {
  public void A() {
    System.out.println("This is in A");
  }
  public void B() {
    System.out.println("This is in B");
  }
  public void C() {
    B();
    System.out.println("This is in C");
  }public void D() {
    A();
    System.out.println("This is in D");
  }
  public static void main(String[] args) {
    multiplemethods ob=new multiplemethods();
    ob.D();
    ob.C();
  }
}