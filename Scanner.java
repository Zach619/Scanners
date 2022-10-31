import java.util.Scanner;

public class MyScanner
{
    READ JAVA ORCLE 8 SCANNER
    READ JAVA ORCLE 8 SCANNER
    READ JAVA ORCLE 8 SCANNER
    READ JAVA ORCLE 8 SCANNER
    READ JAVA ORCLE 8 SCANNER
    public void run() {
        Scanner scanner = new Scanner(System.in); 
        int a = ("4 29 8 73 10 35");
        while (true) {
            if (scanner.hasNext()) {
                String str = scanner.next();
                System.out.println(str);
            }
            Scanner scanner = new Scanner(a);
            while (scanner.hasNext()) {
                String token = scanner.next();
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}

