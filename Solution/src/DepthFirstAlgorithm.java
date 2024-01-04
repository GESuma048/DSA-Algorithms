import java.util.ArrayList;
import java.util.List;

public class DepthFirstAlgorithm {
  public void depthFirstValuesIterative(TreeNode root) {
      List<TreeNode> treeNodeList = new ArrayList<>();
      if(root == null) {
          return;
      }
      treeNodeList.add(root);
      while(!treeNodeList.isEmpty()) {
          var treeNode = treeNodeList.remove(treeNodeList.size()-1);
          System.out.println(treeNode.val);
          if(treeNode.right != null) {
              treeNodeList.add(treeNode.right);
          }
          if(treeNode.left != null) {
              treeNodeList.add(treeNode.left);
          }
      }
  }
}
