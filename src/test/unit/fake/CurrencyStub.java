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
        return "мужской";
    }

    @Override
    public boolean isChanged() {
        return true;
    }

    @Override
    public String getName() {
        return "рубль";
    }

    @Override
    public String getNominativeCase() {
        return "рубль";
    }

    @Override
    public String getGenitiveSingular() {
        return "рубля";
    }

    @Override
    public String getGenitivePlural() {
        return "рублей";
    }
}
