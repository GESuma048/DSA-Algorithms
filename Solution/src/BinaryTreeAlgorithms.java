public class BinaryTreeAlgorithms {
    public static void main(String[] args) {
       var binaryTreeAlgorithms = new BinaryTreeAlgorithms();
       binaryTreeAlgorithms.printDepthFirstValuesUsingIterativeApproach();
       binaryTreeAlgorithms.printDepthFirstValuesUsingRecursiveApproach();
       binaryTreeAlgorithms.treeIncludesUsingDepthFirstAlgorithm();
       binaryTreeAlgorithms.treeSumUsingDepthFirstAlgorithm();
       binaryTreeAlgorithms.treeMinUsingDepthFirstAlgorithm();
       binaryTreeAlgorithms.treeMaxPathSumUsingDepthFirstAlgorithm();

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

    public void treeIncludesUsingDepthFirstAlgorithm() {
        var secondTreeNodeLeft = new TreeNode(4, null, null);
        var secondTreeNodeRight = new TreeNode(5, null, null);
        var firstTreeNodeLeft = new TreeNode(2, secondTreeNodeLeft, secondTreeNodeRight);
        var firstTreeNodeRight = new TreeNode(3, null, null);
        var rootTreeNode = new TreeNode(1, firstTreeNodeLeft, firstTreeNodeRight);

        var depthFirstAlgorithm = new DepthFirstAlgorithm();
        System.out.println(depthFirstAlgorithm.treeIncludesIterative(rootTreeNode, 4));
        System.out.println(depthFirstAlgorithm.treeIncludesRecursive(rootTreeNode, 10));

    }

    public void treeSumUsingDepthFirstAlgorithm() {
        var secondTreeNodeLeft = new TreeNode(4, null, null);
        var secondTreeNodeRight = new TreeNode(5, null, null);
        var firstTreeNodeLeft = new TreeNode(2, secondTreeNodeLeft, secondTreeNodeRight);
        var firstTreeNodeRight = new TreeNode(3, null, null);
        var rootTreeNode = new TreeNode(1, firstTreeNodeLeft, firstTreeNodeRight);

        var depthFirstAlgorithm = new DepthFirstAlgorithm();
        System.out.println(depthFirstAlgorithm.treeSumRecursive(rootTreeNode));
        System.out.println(depthFirstAlgorithm.treeSumIterative(rootTreeNode));

    }

    public void treeMinUsingDepthFirstAlgorithm() {
        var secondTreeNodeLeft = new TreeNode(4, null, null);
        var secondTreeNodeRight = new TreeNode(5, null, null);
        var firstTreeNodeLeft = new TreeNode(2, secondTreeNodeLeft, secondTreeNodeRight);
        var firstTreeNodeRight = new TreeNode(3, null, null);
        var rootTreeNode = new TreeNode(1, firstTreeNodeLeft, firstTreeNodeRight);

        var depthFirstAlgorithm = new DepthFirstAlgorithm();
        System.out.println(depthFirstAlgorithm.treeMinRecursive(rootTreeNode));
        System.out.println(depthFirstAlgorithm.treeMinIterative(rootTreeNode));

    }

    public void treeMaxPathSumUsingDepthFirstAlgorithm() {
        var secondTreeNodeLeft = new TreeNode(4, null, null);
        var secondTreeNodeRight = new TreeNode(5, null, null);
        var firstTreeNodeLeft = new TreeNode(2, secondTreeNodeLeft, secondTreeNodeRight);
        var firstTreeNodeRight = new TreeNode(3, null, null);
        var rootTreeNode = new TreeNode(1, firstTreeNodeLeft, firstTreeNodeRight);

        var depthFirstAlgorithm = new DepthFirstAlgorithm();
        System.out.println(depthFirstAlgorithm.treeMaxPathSumRecursive(rootTreeNode));

    }

}