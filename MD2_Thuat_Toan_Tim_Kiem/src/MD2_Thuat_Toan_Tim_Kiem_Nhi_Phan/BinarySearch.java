package MD2_Thuat_Toan_Tim_Kiem.src.MD2_Thuat_Toan_Tim_Kiem_Nhi_Phan;

import java.util.ArrayList;

public class BinarySearch {
    static int binarySearch(ArrayList<Integer> list, int key){
        int low = 0;
        int high = list.size();
        while (high >= low){
            int mid = (high + low)/ 2;
            if(key < list.get(mid)){
                high = mid -1;
            } else if (key == list.get(mid)) {
                return mid;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
