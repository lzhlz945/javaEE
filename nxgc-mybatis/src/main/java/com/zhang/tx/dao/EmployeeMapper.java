package com.zhang.tx.dao;

import com.zhang.tx.bean.Employee;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbg.generated Wed Jan 13 13:43:37 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbg.generated Wed Jan 13 13:43:37 CST 2021
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbg.generated Wed Jan 13 13:43:37 CST 2021
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbg.generated Wed Jan 13 13:43:37 CST 2021
     */
    Employee selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbg.generated Wed Jan 13 13:43:37 CST 2021
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbg.generated Wed Jan 13 13:43:37 CST 2021
     */
    int updateByPrimaryKey(Employee record);
}