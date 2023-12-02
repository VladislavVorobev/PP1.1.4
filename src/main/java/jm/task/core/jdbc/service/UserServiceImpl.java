package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import javax.transaction.SystemException;
import java.util.List;

public class UserServiceImpl implements UserService   {
    public UserDao userDaoHibernate = new UserDaoHibernateImpl();

    public void createUsersTable() throws SystemException {
        userDaoHibernate.createUsersTable();
        System.out.println("Таблица создана");
    }

    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();
        System.out.println("Таблица удалена");
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernate.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);
        System.out.println("User удален");
    }

    public List<User> getAllUsers() {
        System.out.println(userDaoHibernate.getAllUsers().toString());
        return userDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();
        System.out.println("Таблица очищена");
    }
}
