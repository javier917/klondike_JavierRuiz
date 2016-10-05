package utils;

import java.util.Scanner;

public class InputOutput {
    private Scanner scanner = new Scanner(System.in);

    public int readInt(String message) {
        int output = 0;
        boolean error = true;
        while (error) {
            try {
                this.print(message);
                output = this.scanner.nextInt();
                error = false;
            } catch (Exception e) {
                this.writeError("entero");
            }
        }
        return output;
    }

    public void println() {
        System.out.println();
    }

    public void print(String string) {
        System.out.print(string);
    }

    public void println(String string) {
        System.out.println(string);
    }

    private void writeError(String formato) {
        System.out.println("ERROR DE FORMATO! " + "Introduzca un " + formato + ".");
    }
}
