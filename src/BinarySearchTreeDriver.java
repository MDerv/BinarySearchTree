/* Dhruv Sharma
5/10/2021
5/17/2021
This file is the driver for BinarySearchTree.
*/


public class BinarySearchTreeDriver {

    public static void main(String[] args) {

        BinarySearchTree b = new BinarySearchTree();

        b.put(3, "lol");

        b.put(6, "bruh");

        b.put(7, "hi");

        System.out.println(b.size());

        System.out.println(b.get(6));

        System.out.println(b.contains(new Node(6, "bruh", 3), 6));

        System.out.println(b.min());

        System.out.println(b.max());

        System.out.println(b.remove(6));

        System.out.println(b.get(6));

        System.out.println(b);
    }
}
