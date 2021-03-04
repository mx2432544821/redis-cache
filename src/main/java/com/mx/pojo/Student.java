package com.mx.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author MinXu
 * @since 2021-03-04
 * QQ   754647431
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("student")
public class Student implements Serializable {

    private Integer id;

    private String name;

    private Integer age;


}
