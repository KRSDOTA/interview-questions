package buyandsellstock;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockAgentTest {

    private final FastStockAgent fastStockAgent = new FastStockAgent();
    private final SlowStockAgent slowStockAgent = new SlowStockAgent();

    private static Stream<Arguments> source() {
    return Stream.of(
           Arguments.of(new int[]{7,1,5,3,6,4}, 5),
           Arguments.of(new int[]{7,6,4,3,1}, 0)
    );
    }


    @ParameterizedTest
    @MethodSource("source")
    void shouldCorrectlyFindProfitForStocksSlow(int[] stocks, int expectedProfit){
        assertEquals(expectedProfit, fastStockAgent.maxProfit(stocks));
    }

    @ParameterizedTest
    @MethodSource("source")
    void shouldCorrectlyFindProfitForStocksFast(int[] stocks, int expectedProfit){
        assertEquals(expectedProfit, slowStockAgent.maxProfit(stocks));
    }

}
