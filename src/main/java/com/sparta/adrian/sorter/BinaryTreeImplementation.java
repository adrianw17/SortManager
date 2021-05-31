package com.sparta.adrian.sorter;
import com.sparta.adrian.exceptions.ChildNotFoundException;
import com.sparta.adrian.starter.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BinaryTreeImplementation implements BinaryTree{

    public static final Logger logger = LogManager.getLogger(Main.class);

    private class Node {

        private final int value;
        private Node leftChild;
        private Node rightChild;

        private Node(int value) {
            this.value = value;
        }

        private void createLeftNode(int value) {
            leftChild = new Node(value);
        }

        private void createRightNode(int value) {
            rightChild = new Node(value);
        }

        private int getValue() {
            return value;
        }

        private Node getLeftChild() {
            return leftChild;
        }

        private void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        private Node getRightChild() {
            return rightChild;
        }

        private void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        private boolean isLeftNodeEmpty() {
            return leftChild == null;
        }

        private boolean isRightNodeEmpty() {
            return rightChild == null;
        }
    }

    private Node rootNode;
    private int nodeCount = 1;
    private int index;
    private int[] sortedTree;

//    public BinaryTreeImplementation(final int value) {
//        rootNode = new Node(value);
//    }

    public BinaryTreeImplementation(final int[] array) {
        rootNode = new Node(array[0]);
        for (int i = 1; i < array.length; i++) {
            addElement(array[i]);
        }
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return nodeCount;
    }

    @Override
    public void addElement(int element) {
        rootNode = addElementHelper(rootNode, element);
        //nodeCount++;
    }

    public Node addElementHelper(Node current, int element){
        if (current == null) {
            current = new Node(element);
            nodeCount++;
            return current;
        }

        if (element < current.value) {
            current.leftChild = addElementHelper(current.leftChild, element);
        } else if (element > current.value) {
            current.rightChild = addElementHelper(current.rightChild, element);
        }
        return current;
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        return (getNodeHelper(value) != null);
    }

    private Node searchElement(Node root, int element) {
        if (root == null) {
            return null;
        } else if (element == root.value) {
            return root;
        } else if (element > root.value) {
            return searchElement(root.rightChild, element);
        } else {
            return searchElement(root.leftChild, element);
        }
    }

    private Node getNodeHelper(int element){
        Node node = rootNode;
        while(node != null){
            if(element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            }
            else{
                node = node.getRightChild();
            }
        }
        return null;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        if (!findElement(element)) {
            logger.error("ChildNotFoundException: No Left Child!");
            throw new ChildNotFoundException("No Left Child");
        } else {
            return searchElement(rootNode, element).leftChild.value;
        } }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException{
        if (!findElement(element)) {
            logger.error("ChildNotFoundException: No Right Child!");
            throw new ChildNotFoundException("No Right Child");
        } else {
            return searchElement(rootNode, element).rightChild.value;
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        sortedTree = new int[nodeCount];
        index = 0;
        sortAscending(rootNode);
        return sortedTree;
    }

    private void sortAscending(Node node){
        if(!node.isLeftNodeEmpty()) sortAscending(node.getLeftChild());
        sortedTree[index++] = node.getValue();
        if(!node.isRightNodeEmpty()) sortAscending(node.getRightChild());
    }

    @Override
    public int[] getSortedTreeDesc() {
        sortedTree = new int[nodeCount];
        index = 0;
        sortDescending(rootNode);
        return sortedTree;
    }

    private void sortDescending(Node node){
        if(!node.isRightNodeEmpty()) sortDescending(node.getRightChild());
        sortedTree[index++] = node.getValue();
        if(!node.isLeftNodeEmpty()) sortDescending(node.getLeftChild());
    }
}
