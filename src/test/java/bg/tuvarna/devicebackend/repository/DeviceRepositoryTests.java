package bg.tuvarna.devicebackend.repository;

import bg.tuvarna.devicebackend.repositories.DeviceRepository;
import bg.tuvarna.devicebackend.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

@DataJpaTest
@ActiveProfiles("test")
public class DeviceRepositoryTests
{
	@Autowired
	private DeviceRepository deviceRepository;
    private UserRepository userRepository;

    @BeforeEach
    public void setup()
    {
    }
}
