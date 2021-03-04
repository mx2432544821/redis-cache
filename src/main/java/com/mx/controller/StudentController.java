package com.mx.controller;


import com.mx.pojo.Student;
import com.mx.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author MinXu
 * @since 2021-03-04
 * QQ   754647431
 */
@Controller
@Slf4j
public class StudentController {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    IStudentService studentService;

    @RequestMapping("/")
    @ResponseBody
    public List<Student> find() {

        return studentService.findAll();
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete() {
        studentService.delete(6);
        return 2;
    }

    @RequestMapping("/redis")
    @ResponseBody
    public String redis() {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        String name = (String) redisTemplate.opsForValue().get("name");
        log.info(name);
        return name;
    }
}
