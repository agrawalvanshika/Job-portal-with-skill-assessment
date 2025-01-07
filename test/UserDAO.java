import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private Map<Integer, User> users = new HashMap<>();

    public User findById(int id) {
        return users.get(id);
    }

    public void save(User user) {
        users.put(user.getId(), user);
    }
}
