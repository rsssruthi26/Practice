package com.learning.sruthi.ood;

import com.sun.source.tree.Tree;

public class TreeTraversals {

    static void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.println(root.key + "  ");
            inorder(root.right);
        }

    }
    static void preorder(TreeNode root)
    {
       if(root != null)
        {
            System.out.println(root.key);
            preorder(root.left);
            preorder(root.right);
        }


    }
     void postorder(TreeNode root)
    {
        if(root != null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.println((root.key + " "));

        }

    }
    public static void main(String args[])
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);

        TreeTraversals tt = new TreeTraversals();


        System.out.println("Inorder");
        inorder(root);

        System.out.println("Preorder");
        preorder(root);

        System.out.println("Postorder");
        tt.postorder(root);
    }
}
