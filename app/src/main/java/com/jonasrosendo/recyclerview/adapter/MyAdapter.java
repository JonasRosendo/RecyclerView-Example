package com.jonasrosendo.recyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonasrosendo.recyclerview.R;
import com.jonasrosendo.recyclerview.model.Student;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Student> studentList;

    public MyAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_card, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        Student student = studentList.get(i);

        holder.ra.setText(student.getRA());
        holder.name.setText(student.getName());
        holder.age.setText(String.valueOf(student.getAge()));
        holder.phone.setText(student.getPhone());


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView photo;
        TextView ra, name, age, phone;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.imgv_student_photo);
            ra = itemView.findViewById(R.id.txv_student_ra);
            name = itemView.findViewById(R.id.txv_student_name);
            age = itemView.findViewById(R.id.txv_student_age);
            phone = itemView.findViewById(R.id.txv_student_phone);
        }
    }
}
