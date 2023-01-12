package org.seninar4HW;

public class BeginsWith implements IsGood<String>{

    private String stringToFind;

    public BeginsWith(String stringToFind) {
        this.stringToFind = stringToFind;
    }

    @Override
    public boolean isGood(String item) {
        String itemFirstChar = "" + item.charAt(0);
        return itemFirstChar.equalsIgnoreCase(stringToFind);
    }
}

