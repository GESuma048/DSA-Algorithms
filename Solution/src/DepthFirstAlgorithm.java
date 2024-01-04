import java.util.ArrayList;
import java.util.List;

public class DepthFirstAlgorithm {
  List<Integer> result = new ArrayList<>();
  public List<Integer> depthFirstValuesIterative(TreeNode root) {
      List<TreeNode> treeNodeList = new ArrayList<>();
      if(root == null) {
          return result;
      }
      treeNodeList.add(root);
      while(!treeNodeList.isEmpty()) {
          var treeNode = treeNodeList.remove(treeNodeList.size()-1);
          result.add(treeNode.val);
          if(treeNode.right != null) {
              treeNodeList.add(treeNode.right);
          }
          if(treeNode.left != null) {
              treeNodeList.add(treeNode.left);
          }
      }
      return result;
  }

  public List<Integer> depthFirstValuesRecursive(TreeNode root) {
      if(root == null) return result;

      result.add(root.val);

      depthFirstValuesRecursive(root.left);
      depthFirstValuesRecursive(root.right);

      return result;
  }
}
