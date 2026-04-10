package test;

import main.UseCase11TrainConsist;
import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UseCase11TrainConsistTest {

    @Test
    public void testRegex_ValidTrainID() {
        UseCase11TrainConsist TrainValidationApp = null;
        assertTrue(TrainValidationApp.validateTrainID("TRN-1234"));
    }

    @Test
    public void testRegex_InvalidTrainIDFormat() {
        UseCase11TrainConsist TrainValidationApp = null;
        assertFalse(TrainValidationApp.validateTrainID("TRAIN12"));
        assertFalse(TrainValidationApp.validateTrainID("TRN12A"));
        assertFalse(TrainValidationApp.validateTrainID("1234-TRN"));
    }
    UseCase11TrainConsist TrainValidationApp = null;
    @Test
    public void testRegex_ValidCargoCode() {

        assertTrue(TrainValidationApp.validateCargoCode("PET-AB"));
    }

    @Test
    public void testRegex_InvalidCargoCodeFormat() {
        assertFalse(TrainValidationApp.validateCargoCode("PET-ab"));
        assertFalse(TrainValidationApp.validateCargoCode("PET123"));
        assertFalse(TrainValidationApp.validateCargoCode("AB-PET"));
    }
}