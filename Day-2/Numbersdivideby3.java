//count how many numbers are divide by 3 
public class Numbersdivideby3 {
    public static void main(String [] args)
    {
        int arr[]={3,4,5,6,9};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%3==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
