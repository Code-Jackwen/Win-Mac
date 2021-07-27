package com.nyist.xu.javabasetest.pojo;

import java.util.Objects;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-20 14:36
 **/

//@Data
//@Builder
public class UserExample {

    private Integer id;
    private String name;
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        UserExample that = (UserExample) o;
        return Objects.equals(id, that.id) &&
         Objects.equals(name, that.name) &&
         Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public UserExample(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
