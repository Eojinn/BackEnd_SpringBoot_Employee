package com.employee.api.auth.userinfo;

import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserInfoRepository extends ListCrudRepository<com.employee.api.auth.userinfo.UserInfo, Integer> {
    Optional<com.employee.api.auth.userinfo.UserInfo> findByEmail(String email);
}