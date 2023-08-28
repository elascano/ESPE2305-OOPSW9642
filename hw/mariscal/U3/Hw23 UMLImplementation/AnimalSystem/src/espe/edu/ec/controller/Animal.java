package espe.edu.ec.controller;

import java.util.Date;

public class Animal {

    private Date bornOn;

    private Claw Claw[];

    public Animal(Date bornOn, Claw[] Claw) {
        this.bornOn = bornOn;
        Claw = new Claw[20];
        for (int i = 0; i < 20; i++) {
            this.Claw[i] = new Claw();
        }
    }

    public void getAge() {
    }

    public void feed() {
    }

    public void born() {
    }

    /**
     * @return the bornOn
     */
    public Date getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    /**
     * @return the Claw
     */
    public Claw[] getClaw() {
        return Claw;
    }

    /**
     * @param Claw the Claw to set
     */
    public void setClaw(Claw[] Claw) {
        this.Claw = Claw;
    }
}
