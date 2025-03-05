public class App {
    public static void main(String[] args) throws Exception {
        App.clear();
    }

    /**
     * @hidden Clears the console screen by printing the ANSI escape code for
     *         clearing the screen.
     * @hidden This method uses the escape sequence "\033[H\033[2J" to move the
     *         cursor to the top-left corner and clear the screen.
     * @category System
     * @implNote This method uses the ANSI escape code for clearing the screen.
     */
    private static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}