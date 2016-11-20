package com.prac.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by revan on 11/19/2016.
 */
@Entity
public class Product {

    @Id
    private int pId;

    private String pName;

    private String pTech;

    private int deptId;

    private String productDesc;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpTech() {
        return pTech;
    }

    public void setpTech(String pTech) {
        this.pTech = pTech;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

}
