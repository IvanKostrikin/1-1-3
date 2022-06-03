package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Ivan", "Kostrikin", (byte) 31);
        userDao.saveUser("Petr", "Popov", (byte) 34);
        userDao.saveUser("Semen", "Semenov", (byte) 33);
        userDao.saveUser("Vadim", "Petrov", (byte) 32);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();

    }
}
