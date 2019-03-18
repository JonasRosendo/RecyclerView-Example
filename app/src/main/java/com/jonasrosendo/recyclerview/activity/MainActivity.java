package com.jonasrosendo.recyclerview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.jonasrosendo.recyclerview.R;
import com.jonasrosendo.recyclerview.adapter.MyAdapter;
import com.jonasrosendo.recyclerview.model.RecyclerItemClickListener;
import com.jonasrosendo.recyclerview.model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    MyAdapter myAdapter;
    List<Student> students = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateStudents();
        recycler = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recycler.addItemDecoration(new DividerItemDecoration(this,1));
        recycler.setLayoutManager(layoutManager);
        recycler.setHasFixedSize(true);

        myAdapter = new MyAdapter(students);

        recycler.setAdapter(myAdapter);

        recycler.addOnItemTouchListener(new RecyclerItemClickListener(this, recycler, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Student student = students.get(position);
                Toast.makeText(MainActivity.this, student.getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Student student = students.get(position);
                Toast.makeText(MainActivity.this, String.valueOf(student.getAge()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        }) {
        });


    }

    public void generateStudents(){
        Student student;
        student = new Student("545454", "João Feijão", 14, "11123456789");
        students.add(student);

        student = new Student("515151", "Lucas Maduro", 16, "11564897652");
        students.add(student);

        student = new Student("525252", "Paulo Simão", 15, "11897456325");
        students.add(student);

        student = new Student("535353", "Felipe Loko", 13, "11879456325");
        students.add(student);

        student = new Student("787878", "Ramon Duarte", 17, "11357895145");
        students.add(student);

        student = new Student("989898", "Camila Penha", 14, "11753698521");
        students.add(student);

        student = new Student("636363", "Maria José", 15, "11258963147");
        students.add(student);

        student = new Student("454545", "José Murilo", 16, "11951235789");
        students.add(student);
    }
}
