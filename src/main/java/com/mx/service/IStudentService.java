package com.mx.service;

import com.mx.pojo.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author MinXu
 * @since 2021-03-04
 * QQ   754647431
 */
public interface IStudentService extends IService<Student> {

    List<Student> findAll();

    void delete(int i);
}
