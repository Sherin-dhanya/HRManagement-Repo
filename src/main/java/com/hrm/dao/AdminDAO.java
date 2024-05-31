package com.hrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrm.bean.Admin;


public interface AdminDAO extends JpaRepository<Admin, Integer> {

	Admin getByEmail(String Email);
}
