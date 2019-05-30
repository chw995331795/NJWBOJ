package service;

import entity.Dept;
import java.util.List;

public interface DeptService {
    Boolean addDept(Dept dept);

    Boolean updateDept(Dept dept);

    Boolean delDeptById(int id);

    List<Dept> listAllDept();
}
