package com.example.lang.mvptest.model;


import com.example.lang.mvptest.R;
import com.example.lang.mvptest.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lang on 2017/8/30.
 */

public class StudentMode implements IStudentMode {
    private static List<Student> list = new ArrayList<>();

    /**
     * 本地模拟数据库
     */
    static {
        list.add(new Student("小龙", R.drawable.ic_launcher));
        list.add(new Student("小红", R.drawable.ic_launcher));
        list.add(new Student("小龙", R.drawable.ic_launcher));
    }

    /**
     * 查询学生
     * @param listener
     */
    @Override
    public void query(onQueryListener listener) {
        if (listener != null) {
            listener.onComplete(list);
        }
    }

    /**
     * 添加学生
     * @param listener
     */
    @Override
    public void addStudent(onAddStudentListener listener) {
        list.add(new Student("小燕", R.drawable.ic_launcher));
        if (listener != null) {
            listener.onComplete();
        }
    }

    /**
     * 删除学生
     * @param listener
     */
    @Override
    public void deleteStudent(onDeleteStudentListener listener) {
        if (list.size() > 0) {
            list.remove(list.size() - 1);
        }
        if (listener != null) {
            listener.onComplete();
        }
    }
}
