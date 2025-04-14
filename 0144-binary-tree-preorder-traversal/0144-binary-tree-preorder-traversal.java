class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        preorderHelper(root, li);
        return li;
    }

    private void preorderHelper(TreeNode node, List<Integer> li) {
        if (node == null) return;

        li.add(node.val); 
        preorderHelper(node.left, li);  
        preorderHelper(node.right, li);  
    }
}
