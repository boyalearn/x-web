package com.euexcel.test;

import com.xweb.excel.utils.ExcelUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EuExcelTest {

    @Test
    public void testOne() throws Exception {
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setName("erwer");
        user.setAge(18);
        list.add(user);
        ExcelUtil.write("D:\\demo.xls", list, "demosheet");
    }

    @Test
    public void testTwo() throws Exception {
        List<User> list = new ArrayList<User>();
        list = ExcelUtil.read("D:\\demo2.xlsx", User.class);
        System.out.println(list);
    }

    public static void main(String args[]) throws Exception {

        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setName("erwer");
        user.setAge(18);
        list.add(user);
        ExcelUtil.write("D:\\demo2.xlsx", list, "demosheet");
		
		/*List<User> list=new ArrayList<User>();
		//list=new EuSimpleExcel<User>(User.class).read("F:\\demo2.xlsx");
		list=new EuSimpleExcel<User>(User.class).read("F:\\demo.xls");
		System.out.println(list);*/
    }
}
