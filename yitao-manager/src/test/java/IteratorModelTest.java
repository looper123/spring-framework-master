import com.itcast.yitao.design.model.iteratorModel.Collection;
import com.itcast.yitao.design.model.iteratorModel.Iterator;
import com.itcast.yitao.design.model.iteratorModel.MyCollection;
import com.itcast.yitao.design.model.iteratorModel.MyIterator;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/13.
 */
public class IteratorModelTest {

    @Test
    public void iteratorTest(){
        Object[] ob={"A","B","C","D","E"};
        Collection col = new MyCollection(ob);
        Iterator it = new MyIterator(col);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
