package com.haojiliang.ad.dao;

import com.haojiliang.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * 根据用户名查找用户记录
     *
     * @param username username
     * @return AdUser
     */
    AdUser findByUsername(String username);

}
