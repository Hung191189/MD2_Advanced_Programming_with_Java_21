package Copy_Cac_File_Co_Dung_Luong_Lon;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your source file: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter your destination file: ");
        String destinationPath = scanner.nextLine();
        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);
        try {
//            copyFileUseJava(sourceFile,destinationFile);
            copyFileUseStream(sourceFile,destinationFile);
        } catch (IOException e){
            System.out.println("Cant copy that file");
            System.out.println(e.getMessage());
        }
    }
    public static void copyFileUseJava(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    public static void copyFileUseStream(File source, File dest) throws IOException{
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }finally {
            is.close();
            os.close();
        }
    }
}