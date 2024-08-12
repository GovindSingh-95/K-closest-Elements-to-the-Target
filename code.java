import java.util.*;
public class Solution{
  public static void main(String[] args){
      Scanner Sc=new Scanner(System.in);
      System.out.print("Enter Size of Array: ");
      int n=Sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Enter Elements of Array in increasing Sorted order:");
      for(int i=0;i<n;i++)
        arr[i]=Sc.nextInt();
      System.out.print("Enter Target Element: ");
        int target=Sc.nextInt();
      System.out.print("Enter value of K (number of closest elements to target): ");
        int k=Sc.nextInt();
      System.out.print(k+"Closest elements to "+target+" are "+answer(arr,target,k));
  }
  static List<Integer> answer(int[] arr,int target,int k){
      int n=arr.length;
      List<Integer> Ar=new ArrayList<>();
      int count=0;
         if(target<arr[0]){
        for(int i1=0;i1<k;i1++)
          Ar.add(arr[i1]);
        return Ar;
      }
      if(target>arr[n-1]){
        for(int i2=0;i2<k;i2++)
          Ar.add(arr[n-1-i2]);
        Collections.sort(Ar);
        return Ar;
      }
      int j=LowerBound(int[] arr,target);
      int i=j-1;
     while(i>=0 && j<n && count<k){
         if(Math.abs(target-arr[i])<Math.abs(target-arr[j])){
           Ar.add(arr[i]);
           i--;
           count++;
         }
         else if(Math.abs(target-arr[i])>Math.abs(target-arr[j])){
           Ar.add(arr[j]);
           j++;
           count++;
         }
         else{
           if(arr[i]<=arr[j]){
             Ar.add(arr[i]);
             i--;
           }
           else{
             Ar.add(arr[j]);
             j++;
           }
           count++;
         }
      }
      if(i<0 && count<k){
        while(count<k){
          Ar.add(arr[j]);
          j++;
          count++;
        }
      }
    else{
      while(count<k){
        Ar.add(arr[i]);
        i--;
        count++;
      }
    }
    Collections.sort(Ar);
    return Ar;
  }
  static int LowerBound(int[] arr,int target){
      int idx=arr.length;
      int low=0,high=arr.length-1;
      while(low<=high){
          int mid=low+(high-low)/2;
          if(arr[mid]>=target){
            idx=Math.min(mid,idx);
            high=mid-1;
          }
          else
            low=mid+1;
      }
      return idx;
  }
}
