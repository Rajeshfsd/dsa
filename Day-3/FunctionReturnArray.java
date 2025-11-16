public class FunctionReturnArray {
    public static int[] fun(int n)
    {
        int arr[]={2,5,8};
        return arr;
    }
    public static void main(String [] args)
    {
        int vignesh[]=fun(3);
        for(int i=0;i<vignesh.length;i++)
        {
            System.out.println(vignesh[i]);
        }
    }
}
