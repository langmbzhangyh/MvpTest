package com.example.lang.mvptest.model;


import com.example.lang.mvptest.bean.Student;

import java.util.List;

/**
 * Created by lang on 2017/8/30.
 */

public interface IStudentMode {
    /**
     * 查询所有学生
     * @param listener
     */
    void query(onQueryListener listener);

    /**
     * 添加学生
     * @param listener
     */
    void addStudent(onAddStudentListener listener);

    /**
     * 删除学生
     * @param listener
     */
    void deleteStudent(onDeleteStudentListener listener);

    /**
     * 查询学生回调
     */
    interface onQueryListener{
        void onComplete(List<Student> students);
    }

    /**
     * 添加学生回调
     */
    interface onAddStudentListener{
        void onComplete();
    }

    /**
     * 删除学生回调
     */
    interface onDeleteStudentListener{
        void onComplete();
    }
}
