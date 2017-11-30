import com.itcast.yitao.design.model.ObserverModel.MySubject;
import com.itcast.yitao.design.model.ObserverModel.Observer1;
import com.itcast.yitao.design.model.ObserverModel.Observer2;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/13.
 */
public class ObserverModelTest {

    @Test
    public void observerTest(){
        MySubject mySubject = new MySubject();
        mySubject.add(new Observer1());
        mySubject.add(new Observer2());
        mySubject.operation();
    }
}
