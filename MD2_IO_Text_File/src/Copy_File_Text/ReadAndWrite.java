package Copy_File_Text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<String> read(String filePath){
        List<String> strings = new ArrayList<>();
        try {
            File fileRead = new File(filePath);
            if(!fileRead.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(fileRead));
            String line = "";
            while ((line = br.readLine()) != null){
                strings.add(line);
            }
            br.close();
        }catch (Exception e){
            System.out.println("Find not found");
        }
        return strings;
    }
    public void write(String filePath, List<String> strings){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(writer);
            for (String string : strings) {
                bw.write(string);
                bw.newLine();
            }
            bw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
