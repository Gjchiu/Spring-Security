package com.gjchiu.security.dao;

import com.gjchiu.security.model.Role;

public interface RoleDao {

    Role getRoleByName(String roleName);
}
