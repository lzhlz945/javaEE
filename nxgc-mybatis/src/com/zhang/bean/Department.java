package com.zhang.bean;

public class Department {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_department.id
     *
     * @mbg.generated Fri Dec 25 09:20:16 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_department.dep_name
     *
     * @mbg.generated Fri Dec 25 09:20:16 CST 2020
     */
    private String depName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_department.id
     *
     * @return the value of tbl_department.id
     *
     * @mbg.generated Fri Dec 25 09:20:16 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_department.id
     *
     * @param id the value for tbl_department.id
     *
     * @mbg.generated Fri Dec 25 09:20:16 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_department.dep_name
     *
     * @return the value of tbl_department.dep_name
     *
     * @mbg.generated Fri Dec 25 09:20:16 CST 2020
     */
    public String getDepName() {
        return depName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_department.dep_name
     *
     * @param depName the value for tbl_department.dep_name
     *
     * @mbg.generated Fri Dec 25 09:20:16 CST 2020
     */
    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }
}