package Tim_Gia_Tri_Lon_Nhat_Va_Ghi_Ra_File;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> number){
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++){
            if(max < number.get(i)){
                max = number.get(i);
            }
        }
        return max;
    }
}
