package task4;

public class eqalityArray {

    public static void main(String[] args) {
        int[] arr = { 1,2,3,5,5 };
        int[] arr2 = { 1,2,3,4,5 };
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                System.out.println("Not Equal");
                return;
            }
        }
        System.out.println("Equal");
    }
}
