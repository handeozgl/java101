import java.util.Scanner;

public class Ders_Ortalamasi {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input= new Scanner(System.in);

        System.out.println("matematikden kac aldiniz: ");
        matematik= input.nextInt();

        System.out.println("fizikten kac aldiniz: ");
        fizik= input.nextInt();

        System.out.println("kimyadan kac aldiniz: ");
        kimya= input.nextInt();

        System.out.println("turkceden kac aldiniz: ");
        turkce= input.nextInt();

        System.out.println("tarihten kac aldiniz: ");
        tarih= input.nextInt();

        System.out.println("muzikten kac aldiniz: ");
        muzik= input.nextInt();

        int ortalama= (matematik+ fizik+ kimya+ turkce+ tarih+ muzik)/6;
        System.out.println("ders notu ortalamaniz: "+ ortalama);

        boolean sonuc= ortalama<60;
        System.out.println( sonuc?  "Basarisiz" : "Basarili");
    }
}
