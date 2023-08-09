public class MD2_Tim_gia_tri_nho_nhat {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int index = min(arr);
        System.out.println("The smallest element is: " + arr[index] + " index is: " + index);
    }

    public static int min(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[index]){
                index = i;
            }
        }
        return index;
    }
}
