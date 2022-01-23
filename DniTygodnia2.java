package com.company;

public enum DniTygodnia2 {

    PONIEDZIAŁEK(1), WTOREK(2), SRODA(3),
    CZWARTEK(4), PIĄTEK(5), SOBOTA(6), NIEDZIELA(7);


    DniTygodnia2(int dniTygodnia2) {
        this.dniTygodnia2 = dniTygodnia2;
    }
    private int dniTygodnia2;

    public int getDniTygodnia2() {
        return dniTygodnia2;
    }

}
