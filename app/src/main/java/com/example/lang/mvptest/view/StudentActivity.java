package com.example.lang.mvptest.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.lang.mvptest.R;
import com.example.lang.mvptest.adapter.StudentAdapter;
import com.example.lang.mvptest.bean.Student;
import com.example.lang.mvptest.presenter.StudentPresenter;

import java.util.List;

/**
 * Created by lang on 2017/8/30.
 */

public class StudentActivity extends AppCompatActivity implements IStudentView ,View.OnClickListener{
    private ListView lv;
    private StudentAdapter adapter;
    private Button bt_add, bt_delete;
    private StudentPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        lv = (ListView) findViewById(R.id.lv);
        bt_add = (Button) findViewById(R.id.bt_add);
        bt_delete = (Button) findViewById(R.id.bt_delete);
        bt_add.setOnClickListener(this);
        bt_delete.setOnClickListener(this);

        //中间者类
        presenter = new StudentPresenter(this);
        //查询学生
        presenter.queryStudent();
    }

    /**
     * 展示学生
     * @param list
     */
    @Override
    public void showStudent(List<Student> list) {
        adapter = new StudentAdapter(list,this);
        lv.setAdapter(adapter);
    }

    /**
     * 刷新学生界面
     */
    @Override
    public void refreshStudent() {
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //添加学生
            case R.id.bt_add:
                presenter.addStudent();
                break;
            //删除学生
            case R.id.bt_delete:
                presenter.deleteStudent();
                break;
        }
    }
}
