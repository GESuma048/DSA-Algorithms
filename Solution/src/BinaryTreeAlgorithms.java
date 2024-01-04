public class BinaryTreeAlgorithms {
    public static void main(String[] args) {
       var binaryTreeAlgorithms = new BinaryTreeAlgorithms();
       binaryTreeAlgorithms.printDepthFirstValuesUsingIterativeApproach();
       binaryTreeAlgorithms.printDepthFirstValuesUsingRecursiveApproach();
    }

    private void printDepthFirstValuesUsingRecursiveApproach() {
        var secondTreeNodeLeft = new TreeNode(4, null, null);
        var secondTreeNodeRight = new TreeNode(5, null, null);
        var firstTreeNodeLeft = new TreeNode(2, secondTreeNodeLeft, secondTreeNodeRight);
        var firstTreeNodeRight = new TreeNode(3, null, null);
        var rootTreeNode = new TreeNode(1, firstTreeNodeLeft, firstTreeNodeRight);

        var depthFirstAlgorithm = new DepthFirstAlgorithm();
        System.out.println(depthFirstAlgorithm.depthFirstValuesRecursive(rootTreeNode));
    }

    public void printDepthFirstValuesUsingIterativeApproach() {
      var secondTreeNodeLeft = new TreeNode(4, null, null);
      var secondTreeNodeRight = new TreeNode(5, null, null);
      var firstTreeNodeLeft = new TreeNode(2, secondTreeNodeLeft, secondTreeNodeRight);
      var firstTreeNodeRight = new TreeNode(3, null, null);
      var rootTreeNode = new TreeNode(1, firstTreeNodeLeft, firstTreeNodeRight);

      var depthFirstAlgorithm = new DepthFirstAlgorithm();
        System.out.println(depthFirstAlgorithm.depthFirstValuesIterative(rootTreeNode));
    }
}