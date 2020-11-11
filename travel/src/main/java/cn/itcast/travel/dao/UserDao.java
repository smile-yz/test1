package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    public User finByUsername(String username);

    /**
     * 用户保存
     * @param user
     */
    public void save(User user);

    User finByCode(String code);

    void updateStatus(User user);

    User findByUsernameAndPassword(String username, String password);
}
