public class WhileNumberPlayer {

    private int limit;

    public WhileNumberPlayer(int limit) {
        this.limit = limit;
    }

    public void printSquaresUptoLimit() {
        int i = 1;
        System.out.println("Squares upto limit: ");
        while (i * i < limit) {
            System.out.print(i * i + " ");
            i++;
        }
        System.out.println();
    }

    public void printCubesUptoLimit() {
        int i = 1;
        System.out.println("Cubes upto limit: ");
        while (i * i * i < limit) {
            System.out.print(i * i * i + " ");
            i++;
        }
        System.out.println();
    }
}
