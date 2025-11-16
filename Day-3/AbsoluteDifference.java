public class AbsoluteDifference {
    public static int fun(String s)
    {
        int res=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int a=i;
            int b=i+1;
            char first=s.charAt(a);
            char second=s.charAt(b);
            int num1=first;
            int num2=second;
            int temp=Math.abs(num1-num2);
            res=res+temp;
        }
        return res;
    }
    public static void main(String [] args)
    {
        int result=fun("hello");
        System.out.println(result);
    }
}
