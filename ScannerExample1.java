import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double blackCurrentTotal = 0.00;
        double blackCurrentPrice = 175.00;
        int blackCurrentQuantity;

        double whiteForestPrice = 130.00;
        int whiteForestQuantity;
        double whiteForestTotal = 0.00;

        double redVelvetPrice = 122.00;
        int redVelvetQuantity;
        double velvetTotal = 0.00;

        double chocolatePrice = 127.50;
        int chocolateQuantity;
        double chocolateTotal = 0.00;

        System.out.print("Please enter no of Black Current :");
        blackCurrentQuantity = sc.nextInt();
        blackCurrentTotal = blackCurrentPrice * blackCurrentQuantity;

        System.out.print("Please enter enter no of White Forest :");
        whiteForestQuantity = sc.nextInt();
        whiteForestTotal = whiteForestPrice * whiteForestQuantity;

        System.out.print("Please enter enter no of Chocolate : ");
        chocolateQuantity = sc.nextInt();
        chocolateTotal = chocolatePrice * chocolateQuantity;

        System.out.print("Please enter enter no of Red Velvet :");
        redVelvetQuantity = sc.nextInt();
        velvetTotal = redVelvetPrice * redVelvetQuantity;

        double overallTotal = blackCurrentTotal + whiteForestTotal + chocolateTotal + velvetTotal;

        System.out.println(
                "############################################################################################");
        System.out.println("Menu Item:\tPrice\tQty\tPayable");
        System.out.println(
                "#############################################################################################");

        System.out.println("blackCurrent is:\t" + blackCurrentPrice + "\t  " + blackCurrentQuantity + " \t     "
                + blackCurrentTotal);

        System.out.println(
                "White Forest is:\t" + whiteForestPrice + "\t " + whiteForestQuantity + "\t   " + whiteForestTotal);

        System.out
                .println("Chocolate is:\t" + chocolatePrice + "\t " + chocolateQuantity + " \t      " + chocolateTotal);

        System.out.println("Red Velvet is:\t" + redVelvetPrice + "\t " + redVelvetQuantity + " \t    " + velvetTotal);

        System.out.println(
                "#############################################################################################");

        System.out.println("Total:\t" + "\t                   " + overallTotal);
        System.out.println(
                "#############################################################################################");

       
    }
}
