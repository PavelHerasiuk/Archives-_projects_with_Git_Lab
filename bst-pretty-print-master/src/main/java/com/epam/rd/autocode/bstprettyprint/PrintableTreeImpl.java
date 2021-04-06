package com.epam.rd.autocode.bstprettyprint;

public class PrintableTreeImpl implements PrintableTree {
    private Node root;

    @Override
    public void add(int element) {
        root = addRecursive(root, element);
    }

    private Node addRecursive(Node current, int element) {
        if (current == null)
            return new Node(element);
        if (element > current.getElement()) {
            current.setLeft(addRecursive(current.getLeft(), element));
        } else if (element < current.getElement())
            current.setRight(addRecursive(current.getRight(), element));
        else
            return current;
        return current;
    }

    @Override
    public String prettyPrint() {
        return root.toString();
    }
}