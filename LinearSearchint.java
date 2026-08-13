class LinearSearchint{
    public static void main(String args[]){
      
        int arr[]={5,6,7,3,9,10,13};

        int x=10;

        int i;
        for( i=0; i<arr.length;i++){
            if(arr[i]==x)
            {
                System.out.println("Element at "+i+" int list ");
                break;
            }
        }
         if(i== arr.length)
            {
                 System.out.println("Element not found ");
            }
    }
}