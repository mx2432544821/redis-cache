package com.mx.service.impl;

import com.mx.pojo.Student;
import com.mx.mapper.StudentMapper;
import com.mx.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MinXu
 * @since 2021-03-04
 * QQ   754647431
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public void delete(int i) {
        studentMapper.delete(i);
    }
}
