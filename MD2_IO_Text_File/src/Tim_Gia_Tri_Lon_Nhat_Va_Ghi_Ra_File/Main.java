package Tim_Gia_Tri_Lon_Nhat_Va_Ghi_Ra_File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> number = readAndWriteFile.readFile("D:/IdeaProjects/MD2_IO_Text_File/src/Tim_Gia_Tri_Lon_Nhat_Va_Ghi_Ra_File/Hello.txt");
        int maxValue = FindMaxValue.findMax(number);
        readAndWriteFile.writeFile("D:/IdeaProjects/MD2_IO_Text_File/src/Tim_Gia_Tri_Lon_Nhat_Va_Ghi_Ra_File/result.txt", maxValue);
        System.out.println(maxValue);
    }
}
