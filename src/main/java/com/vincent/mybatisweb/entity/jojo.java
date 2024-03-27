package com.vincent.mybatisweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok 的Data 省掉了所有的getter setter
@Data
@AllArgsConstructor//自动完成有参无参数构造
@NoArgsConstructor
public class jojo {
    private String name;
    private Integer age;
}
