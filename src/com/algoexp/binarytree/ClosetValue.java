package com.algoexp.binarytree;

import java.util.Comparator;

/**
 * Find the Closest value in BST:
 *
 *
 */
public class ClosetValue {
    public static int diff = Integer.MAX_VALUE;
    public static int closest = 0;
    public static int findClosestValueInBst(BST tree, int target) {
        if( tree == null)
            return closest;
        if(Math.abs(tree.value-target) < diff){
            closest = tree.value;
            diff = Math.abs((tree.value - target));
        }
        if(target < tree.value && tree.left != null )
            closest = findClosestValueInBst(tree.left,target);
        if(target > tree.value && tree.right != null)
            closest = findClosestValueInBst(tree.right,target);
        return closest;
    }

    public static int findClosestValueInBst2(BST tree,int target){
        if(tree == null)
            return -1;
        return findHelper(tree,target,Integer.MAX_VALUE);
    }
    private static int findHelper(BST tree,int target, int closest){
        if(Math.abs(tree.value-target) < Math.abs(closest-target)){
            closest = tree.value;
        }
        if( tree.left != null && target < tree.value )
            closest = findHelper(tree.left,target,closest);
        else if( tree.right != null && target > tree.value )
            closest = findHelper(tree.right,target,closest);
        return  closest;
    }
    public static int findClosestValueInBstWorking(BST tree,int target){
        if(tree == null)
            return -1;
        return findHelper2(tree,target,tree.value);
    }
    private static int findHelper2(BST tree,int target, int closest){
        if(Math.abs(tree.value-target) < Math.abs(closest-target)){
            closest = tree.value;
        }
        if( tree.left != null && target < tree.value )
            closest = findHelper(tree.left,target,closest);
        else if( tree.right != null && target > tree.value )
            closest = findHelper(tree.right,target,closest);
        return  closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

            var root = new ClosetValue.BST(10);
            root.left = new ClosetValue.BST(5);
            root.left.left = new ClosetValue.BST(2);
            root.left.left.left = new ClosetValue.BST(1);
            root.left.right = new ClosetValue.BST(5);
            root.right = new ClosetValue.BST(15);
            root.right.left = new ClosetValue.BST(13);
            root.right.left.right = new ClosetValue.BST(14);
            root.right.right = new ClosetValue.BST(22);

            var expected = 13;
            var actual = ClosetValue.findClosestValueInBst(root, 12);
        System.out.println(Integer.compare(expected,actual));

    }
}
