package com.easy;

public class IncreasingOrderSearchTree897 {
	TreeNode main;
    
    public TreeNode increasingBST(TreeNode root) {
        
        if(root.left==null){
            return root;
        }
        
        TreeNode l = increasingBST(root.left);
        
        l.left = null;
        
        insert(l);
        
        TreeNode r = increasingBST(root.right);
        
        r.right = null;
        
        return main;
        
    }
    
    public void insert(TreeNode root){
        if(root==null){
            return;
        }
        
        if(main==null){
            main = root;
            
            return;
        }else{
            main.right = root;
        }
        
    }
}
