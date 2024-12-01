import java.util.Scanner;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        String string01 = scan.nextLine();
        String string02 = scan.nextLine();

        System.out.println(string01.length() + string02.length());

        int compare = string01.compareTo(string02);

        if(compare > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(
                string01.substring(0,1).toUpperCase() + string01.substring(1) + " " +
                        string02.substring(0,1).toUpperCase() + string02.substring(1));

        scan.close();

    }

