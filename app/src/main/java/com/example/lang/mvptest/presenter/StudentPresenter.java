package com.example.lang.mvptest.presenter;


import com.example.lang.mvptest.bean.Student;
import com.example.lang.mvptest.model.IStudentMode;
import com.example.lang.mvptest.model.StudentMode;
import com.example.lang.mvptest.view.IStudentView;

import java.util.List;

/**
 * Created by lang on 2017/8/30.
 */

public class StudentPresenter {
    private IStudentMode studentMode;
    private IStudentView studentView;

    public StudentPresenter(IStudentView studentView) {
        studentMode = new StudentMode();
        this.studentView = studentView;
    }

    /**
     * 通过Model查询学生，在View中展示
     */
    public void queryStudent(){
        studentMode.query(new IStudentMode.onQueryListener() {
            @Override
            public void onComplete(List<Student> students) {
                studentView.showStudent(students);
            }
        });
    }

    /**
     * 通过Model添加学生，在View中更新
     */
    public void addStudent(){
        studentMode.addStudent(new IStudentMode.onAddStudentListener() {
            @Override
            public void onComplete() {
                studentView.refreshStudent();
            }
        });
    }

    /**
     * 通过Model删除学生，在View中更新
     */
    public void deleteStudent(){
        studentMode.deleteStudent(new IStudentMode.onDeleteStudentListener() {
            @Override
            public void onComplete() {
                studentView.refreshStudent();
            }
        });
    }
}
