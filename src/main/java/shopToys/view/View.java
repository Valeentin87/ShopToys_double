package shopToys.view;

import java.util.Scanner;

public class View {

    public static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();

    }
    public void output (String data){
        System.out.println(data);
    }
}
