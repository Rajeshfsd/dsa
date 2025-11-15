class ReversedFor
{
    public static void main(String [] args)
    {
        String s="Rajesh";
        String total="";
        for(int i=5;i>=0;i--)
        {
            total=total+s.charAt(i);
            
        }
        System.out.println(total);
    }
}