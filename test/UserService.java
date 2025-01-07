public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User getUserById(int id) {
        return userDAO.findById(id);
    }

    public void addUser(User user) {
        userDAO.save(user);
    }
}
