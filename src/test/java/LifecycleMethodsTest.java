import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class LifecycleMethodsTest {

        @BeforeAll
        void setupBeforeAll(){
            System.out.println("--Before all--");}


        @BeforeEach
        void setupBeforeEach(){
            System.out.println("----Before each----");
        }


        @org.junit.jupiter.api.Test
        @Order(1)
        @DisplayName("Order: First test")
        void firstTest(){
            System.out.println("It is first test");
        }

        @org.junit.jupiter.api.Test
        @Order(2)
        @DisplayName("Order: Second test")
        void secondTest(){
            System.out.println("It is second test");
        }

        @Disabled("Disabled test")
        @org.junit.jupiter.api.Test
        void disabledTest(){
            System.out.println("It is disabled test");
        }


        @EnabledOnOs(value = OS.MAC, disabledReason = "This is specific test only for Mac")
        @org.junit.jupiter.api.Test
        void onlyForMacTest(){
            System.out.println("It is only for Mac test");
        }

        @EnabledOnOs(value = OS.WINDOWS, disabledReason = "This is specific test only for Windows")
        @org.junit.jupiter.api.Test
        void onlyForWindowsTest(){
            System.out.println("It is only for Windows test");
        }



        @AfterEach
        void setupAfterEach(){
            System.out.println("----After each----");
        }

        @AfterAll
        void setupAfterAll(){
            System.out.println("----After all----");
        }


}
