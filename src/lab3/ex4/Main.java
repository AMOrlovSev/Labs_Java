package lab3.ex4;

import lab3.ex3.House;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Tree tree1 = new Tree(5, "cypress");
        Tree tree2 = new Tree(100, true, "oak");
        Tree tree3 = new Tree();

        out.println(tree1);
        out.println(tree2);
        out.println(tree3);
        out.println(" ");

    }
}

