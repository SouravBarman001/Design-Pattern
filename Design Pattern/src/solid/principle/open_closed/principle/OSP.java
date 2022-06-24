package solid.principle.open_closed.principle;
// object or entities should be open for extension but closed for modification

interface ValueComparator{
   /*
   * if value1 > value2 = +Ve
   * if value1 < value2 = -ve
   * if value1 = value2 = 0
   * */
    int compare(int value1,int value2);
}
class ArrayUtil{
    public static void sort(int[] a, ValueComparator comparator){
        for (int i=0 ; i < a.length; i++){
            for (int j = i +1 ; j<a.length;j++){
                if (comparator.compare(a[i],a[j]) > 0){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}


class AscComparator implements ValueComparator{

    @Override
    public int compare(int value1, int value2) {
        return value1 - value2;
    }
}


class DscComparator implements ValueComparator{

    @Override
    public int compare(int value1, int value2) {
        return value2 - value1;
    }
}



public class OSP {
    public static void main(String[] args) {
          int arr[] = {1,5,4,2,3};
          ArrayUtil.sort(arr, new DscComparator()); // here we can define the class

        System.out.println("Values int the array are sorted");
        for (int element : arr){
            System.out.println(element);
        }
    }
}
