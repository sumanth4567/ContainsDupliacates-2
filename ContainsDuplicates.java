import java.util.Hashtable;
import java.util.Scanner;

public class ContainsDuplicates {
        public String containsDuplicate(int[] nums, int k) {
            Hashtable<Integer,Integer> ht =  new Hashtable<Integer ,Integer>();
            for(int i=0;i<nums.length;i++){
                if((ht.containsKey(nums[i])) && (i-ht.get(nums[i]) <= k)){
                    return "The array contains duplicates and the value of i - j is <= k";
                }
                ht.put(nums[i] , i);
            }
            return "The array may or maynot contains duplicates and the value of i - j is not <= k";
        }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        ContainsDuplicates cd = new ContainsDuplicates();
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of k :");
        int k= sc.nextInt();
        System.out.println("Enter the elements into the array : ");
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        String result= cd.containsDuplicate(nums,k);
        System.out.println(result);
    }
}
