public class Main {
    public Integer getSum(Integer[] exampleArray) {

        Integer sum = 0;

        for (int i = 0; i < exampleArray.length; i++) {
            for (int q = i; q < exampleArray.length; q++) {
                for (int s = i; s <= q; s++) {
                    sum += exampleArray[s];
                }
            }
        }
        return sum;
    }

    public Integer fasterSum(Integer[] exampleArray) {
        Integer sum = 0;
        for (int i = 0; i < exampleArray.length; i++) {
            sum += exampleArray[i] * (exampleArray.length - i) * (i + 1);
        }
        return sum;
    }


    public Long getSumLong(Integer[] exampleArray) {

        Long sum = 0l;

        for (int i = 0; i < exampleArray.length; i++) {
            for (int q = i; q < exampleArray.length; q++) {
                for (int s = i; s <= q; s++) {
                    sum += exampleArray[s];
                }
            }
        }
        return sum;
    }

    public Long fasterSumLong(Integer[] exampleArray) {
        Long sum = 0l;
        for (int i = 0; i < exampleArray.length; i++) {
            sum += exampleArray[i] * (exampleArray.length - i) * (i + 1);
        }
        return sum;
    }
}
