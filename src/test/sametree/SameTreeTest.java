package test.sametree;

import org.junit.jupiter.api.Test;
import sametree.SameTree;
import sametree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTreeTest {

    SameTree sameTree = new SameTree();

    @Test
    void shouldBeSameTree(){
        final TreeNode tree1 = null;
        final TreeNode tree2 = null;

        assertTrue(sameTree.isSameTree(tree1, tree2));
    }

    @Test
    void shouldBeSameTree2(){
        final TreeNode tree1 = new TreeNode(1);
        final TreeNode tree2 = new TreeNode(1);

        assertTrue(sameTree.isSameTree(tree1, tree2));
    }

}
