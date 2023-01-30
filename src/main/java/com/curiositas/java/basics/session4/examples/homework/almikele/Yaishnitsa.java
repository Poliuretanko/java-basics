package com.curiositas.java.basics.session4.examples.homework.almikele;

import com.curiositas.java.basics.session4.examples.homework.almikele.egg.ChickenEgg;
import com.curiositas.java.basics.session4.examples.homework.almikele.spice.BlackPepper;
import com.curiositas.java.basics.session4.examples.homework.almikele.spice.Salt;
import com.curiositas.java.basics.session4.examples.homework.almikele.vegetable.SweetPepper;
import com.curiositas.java.basics.session4.examples.homework.almikele.vegetable.Tomato;

import java.util.List;

public class Yaishnitsa {
    private Salt salt;
    private BlackPepper pepper;
    private Tomato tomato;
    private List<ChickenEgg> eggs;
    private SweetPepper sweetPepper;

    public Yaishnitsa() {
    }

    public Salt getSalt() {
        return salt;
    }

    public void setSalt(Salt salt) {
        this.salt = salt;
    }

    public BlackPepper getPepper() {
        return pepper;
    }

    public void setBlackPepper(BlackPepper pepper) {
        this.pepper = pepper;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public List<ChickenEgg> getEggs() {
        return eggs;
    }

    public void setEggs(List<ChickenEgg> eggs) {
        this.eggs = eggs;
    }

    public SweetPepper getSweetPepper() {
        return sweetPepper;
    }

    public void setSweetPepper(SweetPepper sweetPepper) {
        this.sweetPepper = sweetPepper;
    }
}
