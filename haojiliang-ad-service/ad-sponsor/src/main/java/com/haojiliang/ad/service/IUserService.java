package com.haojiliang.ad.service;

import com.haojiliang.ad.exception.AdException;
import com.haojiliang.ad.vo.CreateUserRequest;
import com.haojiliang.ad.vo.CreateUserResponse;

/**
 * IUserService
 *
 * @author hxx
 */
public interface IUserService {
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
