import java.util.Map;

public class MaxMinValue {
    protected Map<Character, Integer> symbolCollection;
    protected int maxValue;
    protected int minValue;

    public MaxMinValue(Map<Character, Integer> symbolCollection) {
        this.symbolCollection = symbolCollection;
        this.maxValue = -1;
        this.minValue = Integer.MAX_VALUE;
    }

    // метод определения максимального количества повторений
    public void setMaxValue() {
        for (Map.Entry<Character, Integer> keyValue : symbolCollection.entrySet()) {
            if (keyValue.getValue() > maxValue) {
                maxValue = keyValue.getValue();
            }
        }
    }
    public int getMaxValue() {
        return maxValue;
    }

    // метод определения минимального количества повторений
    public void setMinValue() {
        for (Map.Entry<Character, Integer> keyValue : symbolCollection.entrySet()) {
            if (keyValue.getValue() < minValue) {
                minValue = keyValue.getValue();
            }
        }
    }
    public int getMinValue() {
        return minValue;
    }

    // метод вывода символов с максимальным количеством повторений
    public String maxNumberOfSymbol() {
        int k = 0;
        StringBuilder sBtext = new StringBuilder();
        for (Map.Entry<Character, Integer> keyValue : symbolCollection.entrySet()) {
            if (keyValue.getValue().equals(maxValue)) {
                if (k > 0) {
                    sBtext.append("\n");
                }
                k++;
                String t = (k + ". " + "Символ " + "('" + keyValue.getKey() + "')" + " колличество повторений " + keyValue.getValue());
                sBtext.append(t);
            }
        }
        return sBtext.toString();
    }

    // метод вывода символов с минимальным количеством повторений
    public String minNumberOfSymbol() {
        int k = 0;
        StringBuilder sBtext = new StringBuilder();
        for (Map.Entry<Character, Integer> keyValue : symbolCollection.entrySet()) {
            if (keyValue.getValue().equals(minValue)) {
                if (k > 0) {
                    sBtext.append("\n");
                }
                k++;
                String t = (k + ". " + "Символ " + "('" + keyValue.getKey() + "')" + " колличество повторений " + keyValue.getValue());
                sBtext.append(t);
            }
        }
        return sBtext.toString();
    }

}
