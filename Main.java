public class Main {
    public static void main(String[] args) {
        AVL<Integer> tree = new AVL<>();
        tree.add(2);
        tree.add(1);
        tree.add(0);
        tree.remove(1);
    }
}