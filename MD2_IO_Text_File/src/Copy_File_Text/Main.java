package Copy_File_Text;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        List<String> strings = readAndWrite.read("D:/IdeaProjects/MD2_IO_Text_File/src/Copy_File_Text/source.txt");
        readAndWrite.write("D:/IdeaProjects/MD2_IO_Text_File/src/Copy_File_Text/target.txt", strings);
        System.out.println(strings);
    }
}
