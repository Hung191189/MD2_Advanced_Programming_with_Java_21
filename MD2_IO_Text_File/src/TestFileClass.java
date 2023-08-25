import java.io.*;

public class TestFileClass {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("c06/us.gif");
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());
        System.out.println(file.getAbsolutePath());
        System.out.println(new java.util.Date(file.lastModified()));

//        try {
//            FileWriter writer = new FileWriter("Hello.txt");
//            writer.write("Hello!\n");
//            writer.write(1);
//            writer.write("\nc06");
//            writer.close();
//
//        }catch (IOException e){
//            e.printStackTrace();
//
//        }
//        try {
//            File inFile = new File("Hello.txt");
//            FileReader fileReader = new FileReader(inFile);
//            BufferedReader reader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line = reader.readLine()) != null);
//            {
//                System.out.println(line);
//            }
//            reader.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
