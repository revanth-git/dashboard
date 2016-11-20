package com.prac.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by revan on 11/19/2016.
 */
@Entity
public class Department {

    @Id
    private int deptId;

    private String deptName;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
