package com.newler.arkimserver.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    public void testUser() {
        Subject subject = SecurityUtils.getSubject();
        
    }
}