package solid.principle.open_closed.principle;
// object or entities should be open for extension but closed for modification

interface ValueComparator{

}

class ArrayUtil{
    public static void sort(int a[]){
        for (int i=0 ; i < a.length; i++){
            for (int j = i +1 ; j<a.length;j++){
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}



public class OSP {
    public static void main(String[] args) {
          int arr[] = {1,5,4,2,3};
          ArrayUtil.sort(arr);

        System.out.println("Values int the array are sorted");
        for (int element : arr){
            System.out.println(element);
        }
    }
}
