package edu.training.lesson12.example05;

public class DecimalCounter {
    private int maxVal;
    private int minVal;
    private int curVal;

    public DecimalCounter() {
        this.maxVal = 20;
        this.minVal = 0;
        this.curVal = 0;

    }

    public DecimalCounter (int minVal, int maxVal) {
        this.maxVal = minVal;
        this.minVal = maxVal;
        this.curVal = minVal;
    }

    public void increment() {
        if(curVal < maxVal) {
            curVal++;
        } else {
            System.out.println("Достигнуто максимальное значение: " + maxVal);
        }
    }

    public void decrement() {
        if (curVal > minVal) {
            curVal--;
        } else {
            System.out.println("Достигнуто минимальное значение: " + minVal);
        }
    }

    public int getCurVal() {
        return curVal;
    }
}
