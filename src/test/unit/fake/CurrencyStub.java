package test.unit.fake;

import main.Currencies;

public class CurrencyStub implements Currencies {
    @Override
    public String[] getExistsCurrencyInData(String currency) {
        return new String[0];
    }

    @Override
    public String getCurrencyAsStringToPrint() {
        return null;
    }

    @Override
    public String getGenus() {
        return null;
    }

    @Override
    public boolean isChanged() {
        return false;
    }

    @Override
    public String getName() {
        return "рубль";
    }

    @Override
    public String getNominativeCase() {
        return null;
    }

    @Override
    public String getGenitiveSingular() {
        return null;
    }

    @Override
    public String getGenitivePlural() {
        return null;
    }
}
