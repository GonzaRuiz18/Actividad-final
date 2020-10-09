import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utils.Actualizacion;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdatePersonalInformation {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void adasd() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        Login.authentication("gonza.ruiz.18@gmail.com" , "Tourist1history"
        );


       String resultado_esperado = Actualizacion.Actualitation
               ("Gonzalo","Ruiz", "Tourist1history","Tourist1history","Tourist1history");

        assertEquals("Your personal information has been successfully updated.", resultado_esperado);
    }
}
