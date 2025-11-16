public class ReturnFunction {
    static String fun(){
        return "Rajesh";
    }
    static int num(){
        return 1;
    }
    public static void main(String [] args){
        String s=fun();
        System.out.println(s);
        int n=num();
        System.out.println(n);
    }
}
