public class OOPSBanner {
    public static void main(String[] args) {

        // Array storing OOPS banner
        String[] banner = {
            "  OOO   OOO   PPPP   SSSS ",
            " O   O O   O  P   P  S    ",
            " O   O O   O  PPPP    SSS ",
            " O   O O   O  P          S",
            "  OOO   OOO   P      SSSS "
        };

        // Loop to print banner
        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }
    }
}