package com.company;

public enum DniTygodnia3 {
    PONIEDZIAŁEK {
        public String getDescription(){
            return "Poniedziałek - ciężko wstać";
        }
    }, WTOREK{
        public String getDescription(){
            return "Wtorek - ciężko wstać";
        }
    }, ŚRODA{
        public String getDescription(){
            return "Sroda - ciężko wstać";
        }
    }, CZWARTEK{
        public String getDescription(){
            return "Czwartek - ciężko wstać";
        }
    }, PIĄTEK{
        public String getDescription(){
            return "Piątek - ciężko wstać";
        }
    }, SOBOTA{
        public String getDescription(){
            return "Sobota - wyśpię się";
        }
    }, NIEDZIELA{
        public String getDescription(){
            return "Niedziela - wyśpię się";
        }
    };
    public abstract String getDescription();
}
