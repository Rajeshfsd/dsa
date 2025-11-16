public class FunctionWithMultipleParameters {
  public static void a(int n, String s)
  {
    System.out.println(n);
    System.out.println(s);
  }  
  public static void main(String [] args)
  {
    String chem="Chemistry";
    a(143, chem);
  }
}
