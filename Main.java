package com.company;

public class Main {

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        Size size = Size.SMALL;
        System.out.println(size.getSize());

        Rozmiar rozmiar = Rozmiar.LARGE;
        System.out.println(rozmiar.getDescription());

        switch (size.getSize()) {
            case 1:
                System.out.println("Rozmiar 1");
                break;
            case 2:
                System.out.println("Rozmiar 2");
                break;
            case 3:
                System.out.println("Rozmiar 3");
                break;
            default:
                System.out.println("Brak rozmiaru");
        }
//-----------------------------------------------------------------------
        System.out.println("Metoda1 --------------------------------------");
        DniTygodnia dniTygodnia = DniTygodnia.CZWARTEK;
        System.out.println(dniTygodnia);
        System.out.println("Metoda2 --------------------------------------");
        DniTygodnia2 dniTygodnia2 = DniTygodnia2.CZWARTEK;
        System.out.println(dniTygodnia2.getDniTygodnia2());
        System.out.println("Metoda3 --------------------------------------");
        DniTygodnia3 dniTygodnia3 = DniTygodnia3.CZWARTEK;
        System.out.println(dniTygodnia3.getDescription());
        System.out.println("Metoda4 Case --------------------------------------");





	// write your code here
    }
}
