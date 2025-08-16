package com.pddPharmacy.data.models;

public enum Type {

        TABLET(5),
        CAPSULE(5),
        SYRUP(10),
        INJECTION(6),
        Iv(5)
        ;

        private int numberInPack;

        Type(int numberInPack){
                this.numberInPack = numberInPack;
        }

        public int getNumberInPack() {
                return numberInPack;
        }

        public void setNumberInPack(int numberInPack) {
                this.numberInPack = numberInPack;
        }


}
