package com.company;

public class Parrot {
  private String nameParrot;
  private int ageParrot;
  private String colorPattor;

    public void setNameParrot(String nameParrot) {
        this.nameParrot = nameParrot;
    }

    public String getNameParrot() {
        return nameParrot;
    }

    public void setAgeParrot(int ageParrot) {
        this.ageParrot = ageParrot;
        if (ageParrot == 1) {
            System.out.println("Ucha alat");
        }else if (ageParrot>1&& ageParrot<80){
            System.out.println("un chygararyp yrdai alat");
        }
    }
    public int getAgeParrot() {
        return ageParrot;
    }

    public void setColorPattor(String colorPattor) {
        this.colorPattor = colorPattor;
    }

    public String getColorPattor() {
        return colorPattor;
    }
}


