import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class TestMethods {
    protected Map<Character, Integer> symbolCollection;
    protected MaxMinValue maxMinValue;
    protected int n = (int) (Math.random() * 5) + 3;
    protected int[] values = {n, n + 2, n - 1};

    @BeforeEach
    public void beforeEach() {
        symbolCollection = new HashMap<>();
        symbolCollection.put('a', values[0]);
        symbolCollection.put('D', values[1]);
        symbolCollection.put('k', values[2]);
        maxMinValue = new MaxMinValue(symbolCollection);
        System.out.println("Начало теста");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Тест закончен");
    }

    @Test
    public void testSetMaxValue() {
        maxMinValue.setMaxValue();
        int result = maxMinValue.getMaxValue();
        Assertions.assertEquals(values[1], result);
        System.out.println("Тест метода максимального количества повторений");
    }
    @Test
    public void testSetMinValue(){
        maxMinValue.setMinValue();
        int result = maxMinValue.getMinValue();
        Assertions.assertEquals(values[2], result);
        System.out.println("Тест метода минимального количества повторений");
    }
    @Test
    public void testMaxNumberOfSymbol(){
        maxMinValue.setMaxValue();
        String text = maxMinValue.maxNumberOfSymbol();
        Assertions.assertTrue(text.contains("D"));
        String z = String.valueOf(values[1]);
        Assertions.assertTrue(text.contains(z));
        System.out.println("Тест метода вывода символов с максимальным количеством повторений");
    }
    @Test
    public void testMinNumberOfSymbol(){
        maxMinValue.setMinValue();
        String text = maxMinValue.minNumberOfSymbol();
        Assertions.assertTrue(text.contains("k"));
        String z = String.valueOf(values[2]);
        Assertions.assertTrue(text.contains(z));
        System.out.println("Тест метода вывода символов с минимальным количеством повторений");
    }
}
