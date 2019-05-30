import entity.Dept;
import org.junit.Before;
import org.junit.Test;
import service.DeptService;
import service.impl.DeptServiceImpl;

import java.util.List;

public class DeptServiceTest {

    private DeptService deptService;

    @Before
    public void before() {
        deptService = new DeptServiceImpl();
    }


    @Test
    public void testAddDept() {

    }

    @Test
    public void testDeleteById() {

    }

    @Test
    public void testUpdateDept() {

    }

    @Test
    public void testListAllDept() {
        List<Dept> list = deptService.listAllDept();
        for (Dept d:list) {
            System.out.println(d);
        }
    }

}
