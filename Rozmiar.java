package com.company;

public enum Rozmiar {
    SMALL {
        public String getDescription(){
            return "Taki całkiem mały";
        }
    },
    LARGE {
        public String getDescription(){
            return "Dosyć duży";
        }
    };
    public abstract String getDescription();
}
