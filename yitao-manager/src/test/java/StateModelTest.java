import com.itcast.yitao.design.model.stateModel.Context;
import com.itcast.yitao.design.model.stateModel.State;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/14.
 */
public class StateModelTest {

    @Test
    public void stateTest() {
        State state = new State();
        Context context = new Context(state);
        //状态1
        state.setValue("state1");
        context.method();
        //状态2
        state.setValue("state2");
        context.method();
    }
}
