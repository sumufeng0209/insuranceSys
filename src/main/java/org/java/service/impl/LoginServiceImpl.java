package org.java.service.impl;

import org.java.dao.LoginMapper;
import org.java.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.shiro.crypto.hash.Md5Hash;

import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Map<String, String> login(String user, String pwd) {
        Md5Hash md5=new Md5Hash(pwd);
        System.out.println(md5.toString());
        return loginMapper.login(user, md5.toString());
    }
}
