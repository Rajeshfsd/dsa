public class DivideByTwoOrThree {
    public static void main(String [] args)
    {
        int arr[]={1,3,5,9,15,12,1};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            if(temp%2==0 || temp%3==0)
            {
                count++;
            }

        }
        System.out.println(count);
    }
}
