//count how many times 1 appeared in the array
class Count1
{
    public static void main(String [] args)
    {
        int arr[]={1,3,5,8,10,16,1,1};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}