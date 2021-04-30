package com.fc.Text;

import com.fc.bean.Student;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Serializable {
    @Test
    public void text(){
        ObjectOutputStream objectOutputStream = null;
        try {
             objectOutputStream = new ObjectOutputStream(new FileOutputStream("Student.txt"));
            Student student = new Student();

            student.setId(1);
            student.setName("小明");
            student.setInfo("12");
            student.setBirthday(new Date());

            List<Student> list = new ArrayList<>();

            list.add(student);
            objectOutputStream.writeObject(list);



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void InText(){
        ObjectInputStream objectInputStream = null;
        try {
             objectInputStream = new ObjectInputStream(new FileInputStream("Student.txt"));

            List<Student> student = (List<Student>) objectInputStream.readObject();


            System.out.println(student.get(0));
            System.out.println(student.get(0).getName());


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
