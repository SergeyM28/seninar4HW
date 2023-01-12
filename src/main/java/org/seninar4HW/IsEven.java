package org.seninar4HW;

public class IsEven implements IsGood<Integer>{

    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }
}
