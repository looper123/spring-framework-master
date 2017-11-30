import com.itcast.yitao.design.model.bridgeModel.Bridge;
import com.itcast.yitao.design.model.bridgeModel.ResourceableSub1;
import com.itcast.yitao.design.model.bridgeModel.ResourceableSub2;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/9.
 */
public class BridgeModelTest {

    @Test
    public void bridgeTest(){
        Bridge bridge = new Bridge();
//        调用第一个方法
        ResourceableSub1 resourceableSub1 = new ResourceableSub1();
        bridge.setResourceable(resourceableSub1);
        bridge.resourceable();
//        调用第二个方法
        ResourceableSub2 resourceableSub2 = new ResourceableSub2();
        bridge.setResourceable(resourceableSub2);
        bridge.resourceable();

    }
}
