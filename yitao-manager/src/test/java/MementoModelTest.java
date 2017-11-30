import com.itcast.yitao.design.model.mementoModel.Oraginal;
import com.itcast.yitao.design.model.mementoModel.Storage;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/14.
 */
public class MementoModelTest {

    @Test
    public void mementoTest(){
//        创建原始类
        Oraginal oraginal = new Oraginal("oraginal class");

//        创建备忘录存储类(存储原始类)
        Storage storage = new Storage(oraginal.createMemento());

        System.out.println("初始化状态"+oraginal.getValue());
//        修改备忘录状态
        oraginal.setValue("update class");
        System.out.println("修改后的状态"+oraginal.getValue());
//        恢复备忘录到初始状态
        oraginal.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态"+oraginal.getValue());
    }
}
