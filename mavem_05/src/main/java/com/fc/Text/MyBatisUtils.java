package com.fc.Text;

import com.fc.Dao.StudentDao;
import com.fc.Utils.Utils;
import com.fc.bean.Student;
import org.junit.Test;

import java.util.List;

public class MyBatisUtils {
    @Test
    public void textAdd(){
        try {
            StudentDao mapper = Utils.getMapper(StudentDao.class);

            List<Student> list = mapper.finadd();
            for (Student student : list) {
                System.out.println(student);
            }
            Utils.commit();
        } catch (Exception e) {
            e.printStackTrace();
            Utils.rollback();

        }


    }

    @Test
    public void  findById(){
        try {
            StudentDao mapper = Utils.getMapper(StudentDao.class);
            Student studentById = mapper.findStudentById(2);
            System.out.println(studentById);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
