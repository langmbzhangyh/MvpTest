package com.example.lang.mvptest.view;


import com.example.lang.mvptest.bean.Student;

import java.util.List;

/**
 * Created by lang on 2017/8/30.
 */

public interface IStudentView {

    void showStudent(List<Student> list);

    /**
     * 刷新学生
     */
    void refreshStudent();
}
