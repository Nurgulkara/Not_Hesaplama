import java.util.Scanner;
public class Not_Ortalamasi_Hesabi {
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
int mat, fizik, kimya, turkce, tarih, muzik;
        System.out.println("Matematik Notunu Giriniz: ");
        mat=input.nextInt();
        System.out.println("Fizik Notunu Giriniz: ");
        fizik=input.nextInt();
        System.out.println("Kimya Notunu Giriniz: ");
        kimya=input.nextInt();
        System.out.println("Turkce Notunu Giriniz: ");
        turkce=input.nextInt();
        System.out.println("Tarih Notunu Giriniz: ");
        tarih=input.nextInt();
        System.out.println("Muzik Notunu Giriniz: ");
        muzik=input.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;
        System.out.println("Not Ortalamaniz: " +sonuc);

        String kosul = (sonuc>= 60) ? "Gecti" :"Kaldi";
        System.out.println("Durumunuz: " +kosul);

    }
}
