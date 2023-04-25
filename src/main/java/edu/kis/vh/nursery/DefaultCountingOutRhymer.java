package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY = -1;
    public static final int DEFAULT_VALUE = -1;
    private final int[] numbers = new int[getMaxSize()];

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public static int getDefaultValue() {
        return DEFAULT_VALUE;
    }

    public int getTotal() {
        return total;
    }

    private int total = getEMPTY();

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == getEMPTY();
    }

    public boolean isFull() {
        return total == getMaxSize() -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return getDefaultValue();
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return getDefaultValue();
        return numbers[total--];
    }

}