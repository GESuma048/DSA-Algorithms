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

  public boolean treeIncludesIterative(TreeNode root, int target) {
      if(root == null) return false;
      List<TreeNode> treeNodeList = new ArrayList<>();

      treeNodeList.add(root);

      while(!treeNodeList.isEmpty()) {
          var treeNode = treeNodeList.remove(treeNodeList.size()-1);
          result.add(treeNode.val);
          if(treeNode.val == target) {
              return true;
          }
          if(treeNode.right != null) {
              treeNodeList.add(treeNode.right);
          }
          if(treeNode.left != null) {
              treeNodeList.add(treeNode.left);
          }
      }
      return false;

  }

    public boolean treeIncludesRecursive(TreeNode root, int target) {
        if(root == null) return false;

        if(root.val == target) return true;

        return treeIncludesRecursive(root.left, target) || treeIncludesRecursive(root.right, target);

    }

    public int treeSumRecursive(TreeNode root) {
        if(root == null) return 0;

        return root.val + treeSumRecursive(root.left) + treeSumRecursive(root.right);

    }

    public int treeSumIterative(TreeNode root) {
        List<TreeNode> treeNodeList = new ArrayList<>();
        int totalSum = 0;
        if(root == null) {
            return 0;
        }
        treeNodeList.add(root);
        while(!treeNodeList.isEmpty()) {
            var treeNode = treeNodeList.remove(treeNodeList.size()-1);
            totalSum = totalSum + treeNode.val;
            if(treeNode.right != null) {
                treeNodeList.add(treeNode.right);
            }
            if(treeNode.left != null) {
                treeNodeList.add(treeNode.left);
            }
        }
        return totalSum;
    }

    public int treeMinIterative(TreeNode root) {
        List<TreeNode> treeNodeList = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        if(root == null) {
            return 0;
        }
        treeNodeList.add(root);
        while(!treeNodeList.isEmpty()) {
            var treeNode = treeNodeList.remove(treeNodeList.size()-1);
            min = Math.min(min, treeNode.val);
            if(treeNode.right != null) {
                treeNodeList.add(treeNode.right);
            }
            if(treeNode.left != null) {
                treeNodeList.add(treeNode.left);
            }
        }
        return min;
    }

    public int treeMinRecursive(TreeNode root) {
        if(root == null) return Integer.MAX_VALUE;

        return Math.min(root.val, Math.min(treeMinRecursive(root.right), treeMinRecursive(root.left)));

    }

    public int treeMaxPathSumRecursive(TreeNode root) {
        if(root == null) return Integer.MIN_VALUE;
        if(root.left == null && root.right == null) return root.val;
        var max = Math.max(treeMaxPathSumRecursive(root.left), treeMaxPathSumRecursive(root.right));
        return root.val + max;
   }
}
