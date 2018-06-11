package cn.zr.JZoffer;


/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列
 * {4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

public class RebuildTree {
    public static void main(String[] args) {
        int []a = new int[]{1,2,3,4,5,6,7};
        int []b = new int[]{3,2,4,1,6,5,7};
        TreeNode node=new RebuildTree().reConstructBinaryTree(a,b);
        new RebuildTree().printnode(node);
    }
    public void printnode(TreeNode t){
        TreeNode curr0 =t;
        TreeNode curr1 = t;
        if (null != curr0){
            System.out.println(curr0.val);
            if (null!=curr0.left){
                curr0=curr0.left;
                printnode(curr0);
            }
            if (null!=curr1.right){
                curr1 = curr1.right;
                printnode(curr1);
            }
        }
    }
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        //定义根节点
        TreeNode root = new TreeNode(pre[0]);
        int len = pre.length;
//        TreeNode curr = null;//当前节点
        if(len == 1){
            root.left = null;
            root.right =null;
            return root;
        }

        int i;
        int rootval=root.val;
        //找到先序遍历的根节点的位置
        for(i =0;i<len;i++){
            if (rootval==in[i]){
                break;
            }
        }
        //创建左子树
        if(i>0) {
            int []subleft = new int[i];
            int []subin = new int[i];
            for (int j =0;j<i;j++){
                subleft[j] = pre[j+1];//左子树
            }
            for (int j=0;j<i;j++){
                subin[j]=in[j];
            }
            //递归调用
            root.left = reConstructBinaryTree(subleft,subin);
        }else{
            root.left = null;
        }

        //创建右子树
        if (len-i-1>0){
            int []subpr = new int[len - i-1];
            int []subin = new int[len - i-1];
            for (int j =i+1;j<len;j++){
                subpr[j-i-1] =pre[j];//右子树的左子树
                subin[j-i-1] =in[j];//
            }
            //递归调用
            root.right =reConstructBinaryTree(subpr,subin);

        }else{
            root.right = null;
        }
        return root;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}