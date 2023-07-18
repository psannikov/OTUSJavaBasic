package main;

public interface Currencies {
    public String[] getExistsCurrencyInData (String currency);
    public String getCurrencyAsStringToPrint();
    public String getGenus();

    public boolean isChanged();

    public String getName();

    public String getNominativeCase();

    public String getGenitiveSingular();

    public String getGenitivePlural();
}
