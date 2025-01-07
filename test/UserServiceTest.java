import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {
    private UserService userService;

    @Mock
    private UserDAO userDAO;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        userService = new UserService(userDAO);
    }

    @Test
    public void testGetUserById() {
        User mockUser = new User(1, "John Doe");
        when(userDAO.findById(1)).thenReturn(mockUser);

        User user = userService.getUserById(1);

        assertNotNull(user);
        assertEquals("John Doe", user.getName());
    }

    @Test
    public void testAddUser() {
        User user = new User(2, "Jane Doe");
        userService.addUser(user);

        verify(userDAO, times(1)).save(user);
    }
}
