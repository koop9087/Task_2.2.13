public class Main {
    public static void main(String[] args) {
        int size = SizeRandomFiller.randomSize();
        int[][] array = new int[size][size];
        Filler.fill(array);
        Printer.printIntMatrix(array);
        Calculate.orderingTheMatrix(array);
        Printer.printIntMatrix(array);
    }
}
