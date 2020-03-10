package com.xxxy.erer15.service.impl;

import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.dao.StudentDao;
import com.xxxy.erer15.model.Student;
import com.xxxy.erer15.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * StudentServiceImpl
 *
 * @author erer
 * @date 2020/3/9
 */
@Service
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;
    @Override
    public Results<Student> getAllstudnetsByPage(Integer startPosition, Integer limit) {
        return Results.success(studentDao.countAllStudnets().intValue(), studentDao.getAllStudnetByPage(startPosition,limit));
    }
}
