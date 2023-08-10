import java.util.Scanner;

public class MD2_Dem_so_lan_kytu_xuathien_trongchuoi {
    public static void main(String[] args) {
        System.out.println("nhap chuoi");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Nhap ky tu muon tim:");
        String a = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if(a.charAt(0) == string.charAt(i)){
                count++;
            }
        }
        System.out.println("Ky tu "+ a + " co trong chuoi string va xuat hien " + count + " lan" );
    }
}
