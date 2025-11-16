public class FunctionOrder {
 public static void a()
 {
    System.out.println("a");
 }   
  public static void b()
 {
    System.out.println("b");
 }  
  public static void c()
 {
    System.out.println("c");
 }  
 public static void main(String [] args){
    a();
    c();
    b();
    a();
    c();

 }
}
