package com.alexzheng.repository;

import com.alexzheng.entity.Student;

import java.util.Collection;

/**
 * @Author Alex Zheng
 * @Date 2020/10/9 20:11
 * @Annotation
 */
public interface StudentRepository {

    public Collection<Student> findAll();

    public Student findById(long id);

    public void saveOrUpdate(Student student);

    public void deleteById(long id);

}
