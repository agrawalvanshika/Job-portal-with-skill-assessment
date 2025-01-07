import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UserDAOTest {
    private UserDAO userDAO;

    @Before
    public void setUp() {
        userDAO = new UserDAO();
    }

    @Test
    public void testFindById() {
        User user = new User(1, "John Doe");
        userDAO.save(user);

        User foundUser = userDAO.findById(1);

        assertNotNull(foundUser);
        assertEquals("John Doe", foundUser.getName());
    }

    @Test
    public void testSave() {
        User user = new User(2, "Jane Doe");
        userDAO.save(user);

        User foundUser = userDAO.findById(2);

        assertNotNull(foundUser);
        assertEquals("Jane Doe", foundUser.getName());
    }
}
