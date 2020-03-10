package com.xxxy.erer15.service;

import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.model.Student;

/**
 * StudentService
 *
 * @author erer
 * @date 2020/3/9
 */
public interface StudentService {

    Results<Student> getAllstudnetsByPage(Integer startPosition, Integer limit);
}
