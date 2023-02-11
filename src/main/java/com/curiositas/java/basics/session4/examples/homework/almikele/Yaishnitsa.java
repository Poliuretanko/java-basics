package com.curiositas.java.basics.session4.examples.homework.almikele;

import com.curiositas.java.basics.session4.examples.homework.almikele.egg.Egg;
import com.curiositas.java.basics.session4.examples.homework.almikele.spice.BlackPepper;
import com.curiositas.java.basics.session4.examples.homework.almikele.spice.Salt;
import com.curiositas.java.basics.session4.examples.homework.almikele.vegetable.SweetPepper;
import com.curiositas.java.basics.session4.examples.homework.almikele.vegetable.Tomato;

import java.util.Set;

public class Yaishnitsa {
    private Salt salt;
    private BlackPepper pepper;
    private Tomato tomato;
    private Set<Egg> eggs;
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

    public Set<Egg> getEggs() {
        return eggs;
    }

    public void setEggs(Set<Egg> eggs) {
        this.eggs = eggs;
    }

    public SweetPepper getSweetPepper() {
        return sweetPepper;
    }

    public void setSweetPepper(SweetPepper sweetPepper) {
        this.sweetPepper = sweetPepper;
    }
}
