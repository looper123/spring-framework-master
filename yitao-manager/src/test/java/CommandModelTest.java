import com.itcast.yitao.design.model.CommandModel.Invoker;
import com.itcast.yitao.design.model.CommandModel.MyCommand;
import com.itcast.yitao.design.model.CommandModel.Receiver;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/14.
 */
public class CommandModelTest {

    @Test
    public void commandTest(){
        Receiver receiver = new Receiver();
        MyCommand myCommand = new MyCommand(receiver);
        Invoker invoker = new Invoker(myCommand);
        invoker.action();
    }
}
