public class Search
{
    
    public static void main(String[] args)
    {
         int[] arr1 = {7, 9, 11, 12};
         
        int key = 11;
        // Linear Search
       for(int i = 0; i < arr.length; i++)
       {
            if(arr1[i] == key)
            {
                System.our.println("found at index at " + i);
            }

       }
       System.our.println("not found");

    }

    // Binary search
    int first = arr1[0];
    int last = arr1[arr1.length];
    int mid = (first+last)/2;

    int binkey = 9;

    while(first <= last)
    {
        switch(key)
        {
            case (arr1[mid]<key):
                first = mid + 1;
                continue;
            case (arr[mid] == key):
                System.out.println("found");
                break;
            default:
                last = mid - 1;
                continue;
        }
    }
    System.out.println("binary search not found");
}