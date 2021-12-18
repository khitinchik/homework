import org.junit.jupiter.api.*;

public class HomeWork {


    @BeforeAll
    static void beforeAll () {
        System.out.println("@BeforeAll method!");
    }

    @BeforeEach
    void beforeEach () {
        System.out.println("    @BeforeEach method!");
    }

    @AfterEach
    void afterEach () {
        System.out.println("    @AfterEach method!");
    }

    @AfterAll
    static void afterAll () {
        System.out.println("@AfterAll method!");
    }

    @Test
    void work () {
        System.out.println("w");
    }

    @Test
    void workOne () {
        System.out.println("w");
    }


    }


