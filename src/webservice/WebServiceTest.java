package webservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class WebServiceTest {

    private int idNumber;
    private String expectedResult;

    public WebServiceTest(int idNumber, String expectedResult) {
        this.idNumber = idNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters (name = "id = {0}, expected result is: {1} ")
    public static java.util.Collection data() {
        List list = new ArrayList();
        for (int i = 1; i <= 1000; i++) {
            list.add(new Object[]{i, "hello " + i});
        }

        return list;
    }


    @Test
    public void getRequestTest() throws Exception {
        String actualResult = WebService.sendGetRequest(idNumber);
        assertEquals(expectedResult, actualResult);
    }

}
