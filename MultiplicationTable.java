public class MultiplicationTable {

    public void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public void printTable(int num1, int num2, int num3) {
        printTable(num1);
        System.out.println();
        printTable(num2);
        System.out.println();
        printTable(num3);
    }

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        table.printTable(3, 7, 9);
    }
}
