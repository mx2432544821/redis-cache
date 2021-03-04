package com.mx.mapper;

import com.mx.pojo.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author MinXu
 * @since 2021-03-04
 * QQ   754647431
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> findAll();

    void delete(int i);
}
