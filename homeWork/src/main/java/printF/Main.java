package printF;

public class Main {
    public static void main(String[] args) {
        //printF EXAMPLES
        System.out.printf("%b", 10<=10);
        System.out.printf("%b", null);
        System.out.printf("%C", 'a');

        //RIGHT JUSTAFIED
        System.out.printf("%3d", 1234567);
        System.out.printf("%3d", -999999);

        //LEFT JUSTAFIED
        System.out.printf("%-3d", 1234567);
        System.out.printf("%-3d", -999999);

        //Add Zero
        System.out.printf("%03d",9);
        System.out.printf("%03d",20);
        System.out.printf("%03d", -20);

        //spaceFive
        System.out.printf("'%5d'", 123);
        System.out.printf("'%+5d'", 123);

        //formatting floating point
        System.out.printf("'%.1f'", 99.57);
        System.out.printf("'%08.2f'", 99.57);

        //String Format
        System.out.printf("'%s'", "YaYa");
        System.out.printf("'%10s'", "YaYa");

        //SPECIAL
        System.out.printf("Ya\tYa");
        System.out.printf("Ya\nYa");




    }
}
