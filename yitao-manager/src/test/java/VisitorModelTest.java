import com.itcast.yitao.design.model.VisitorModel.MySubject;
import com.itcast.yitao.design.model.VisitorModel.MyVisitor;
import com.itcast.yitao.design.model.VisitorModel.Subject;
import com.itcast.yitao.design.model.VisitorModel.Visitor;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/14.
 */
public class VisitorModelTest {

    @Test
    public  void  visitorTest(){
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
