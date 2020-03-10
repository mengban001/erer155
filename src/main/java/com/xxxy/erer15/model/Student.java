package com.xxxy.erer15.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
//完美继承
@EqualsAndHashCode(callSuper =  true)
public class Student extends BaseEntity<Long>{
    private static final long serialVersionUID = -6525908145032868837L;
    private String studentid;
    private String name;
    private String gender;
    private Integer age;
    private String college;
    private String studentclass;
    private String phone;
    private String email;
    private Integer status;
    public interface Status {
        int DISABLED = 0;
        int VALID = 1;
        int LOCKED = 2;
    }

}
