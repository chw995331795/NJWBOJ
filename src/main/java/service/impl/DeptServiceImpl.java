package service.impl;

import entity.Dept;
import service.DeptService;
import java.util.ArrayList;
import java.util.List;

public class DeptServiceImpl implements DeptService {
    @Override
    public Boolean addDept(Dept dept) {
        if (dept.getDeptId() <= 0) {
            return false;
        }
        if ("".equals(dept.getDeptLoc())) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean updateDept(Dept dept) {
        return null;
    }

    @Override
    public Boolean delDeptById(int id) {
        return null;
    }

    @Override
    public List<Dept> listAllDept() {
        List<Dept> list = new ArrayList<Dept>();
        for (int i=0; i<=100; ++i) {
            Dept d = new Dept();
            d.setDeptId(i+1);
            d.setDeptLoc("部门位置"+i);
            d.setDeptManager("负责人"+i);
            d.setDeptName("部门名称"+i);
            list.add(d);
        }
        return list;
    }
}
