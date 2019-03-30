package com.song.mybatisTest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    
    private Integer id;
    
    private String lastName;
    
    private String email;
    
    private Integer gender;
}
