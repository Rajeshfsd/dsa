public class LargestNumberInArray {
    public static void main(String [] args){
    int arr[]={5,8,10,11,50,15,20,25};
   int temp=0;
    for(int i=0;i<arr.length;i++){
        
        // System.out.println(temp);
        if(arr[i]>temp){
            temp=arr[i];
            //another method
            //temp=Math.max(arr[i],temp);
            
        }
    }
            System.out.println(temp);

    }
}
