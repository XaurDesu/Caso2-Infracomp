import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgingAlgorithmTest {
    AgingAlgorithm ageing = new AgingAlgorithm();
    FReader read = new FReader();
    Time_ time = new Time_();
    TablaPagina tp = new TablaPagina(4, time);

    @Test
    void AgingAlgorithmTest(){

    }
    @AfterEach
    void before()
    {
       time = new Time_();
        tp = new TablaPagina(4, time);
        ageing = new AgingAlgorithm();


    }

    @Test
    void ageingAlgorithm() {
                    assertEquals(11, ageing.ageingAlgorithm(
                            read.readFile("examples/test_A_R32_P8.txt"),
                            tp,
                            4
                    ));
                        assertEquals(12, ageing.ageingAlgorithm(
                                read.readFile("examples/test_B_R32_P8.txt"),
                                tp,
                                4
                        ));
                        assertEquals(7, ageing.ageingAlgorithm(
                                read.readFile("examples/test_A2_R32_P8.txt"),
                                tp,
                                4
                        ));
                        assertEquals(15, ageing.ageingAlgorithm(
                                read.readFile("examples/test_B2_R32_P8.txt"),
                                tp,
                                4));

    }

}
