package pbo2.pkg10116374.latihan11.formatting;

/** @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakikan Formatting
 */
public class PBO210116374Latihan11Formatting {

    public static void main(String[] args) {
        int i = 3546764;
        int iMinus = -i;
        System.out.println("1 : " + i);
        System.out.printf("%%d : %d%n", i);
        System.out.printf("%%10d : %10d%n", i);
        System.out.printf("%%+10d : %+10d%n", i);
        System.out.printf("%%+10d : %+10d%n", iMinus);
        System.out.printf("%%,10d : %,10d%n", i);
        System.out.printf("%%-10d : %-10d%n", i);
        double f = 5675482.982;
        System.out.printf("f : " + f);
        System.out.printf("%%f : %f%n", f);
        System.out.printf("%%2f : %.2f%n", f);
        System.out.printf("%%.2f : %.2f%n", f);
        System.out.printf("%%12.2f : %12.2f%n", f);
        System.out.printf("%%.12.2f : %,12.2f%n", f);
        
        
    }
    
}
