import com.itcast.yitao.design.model.compositeModel.Tree;
import com.itcast.yitao.design.model.compositeModel.TreeNode;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/9.
 */
public class CompositeModelTest {

    @Test
    public void CompositeTest(){
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.treeNode.add(nodeB);
        System.out.println("build the tree finished!");
    }
}
