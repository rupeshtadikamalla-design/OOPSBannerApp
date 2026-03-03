public class OOPSBanner {
    public static void main(String[] args) {

        // Array initialization with banner text
        String[] banner = {
            "  OOOOO    OOOOO   PPPPPP    SSSSS  ",
            " O     O  O     O  P     P  S       ",
            " O     O  O     O  P     P   SSSSS   ",
            " O     O  O     O  PPPPPP        S   ",
            "  OOOOO    OOOOO   P        SSSSS    "
        };

        // Printing the banner using loop
        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }
    }
}