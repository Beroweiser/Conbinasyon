/**
 * ConbinasyonHesabi
 */
import java.util.Scanner;

public class ConbinasyonHesabi {

    public static void main(String[] args) {
        int n,r,nfak = 1,rfak = 1,nrfak = 1,total;
        Scanner inp = new Scanner(System.in);

        System.out.println("N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. \nN’in r’li kombinasyonu C(n,r) şeklinde gösterilir.");
        System.out.print("n değerini giriniz : ");
        n = inp.nextInt();
        System.out.print("r değerini giriniz : ");
        r = inp.nextInt();
        for (int i = 1 ; i <= n ; i++){
            nfak *= i;
        }
        for (int i = 1; i <= r ; i++){
            rfak *= i;
        }
        for (int i = 1; i <= (n - r);i++ ){
            nrfak *= i;
        }

        total = nfak / (rfak *nrfak);
        System.out.println("Kombinasyon C("+n+","+r+") : "+ total);


    }
}