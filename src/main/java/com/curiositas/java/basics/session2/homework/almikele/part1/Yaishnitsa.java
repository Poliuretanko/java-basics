package com.curiositas.java.basics.session2.homework.almikele.part1;

import com.curiositas.java.basics.session2.homework.almikele.part1.egg.ChickenEgg;
import com.curiositas.java.basics.session2.homework.almikele.part1.spice.Pepper;
import com.curiositas.java.basics.session2.homework.almikele.part1.spice.Salt;
import com.curiositas.java.basics.session2.homework.almikele.part1.vegetable.SweetPepper;
import com.curiositas.java.basics.session2.homework.almikele.part1.vegetable.Tomato;

import java.util.List;

public class Yaishnitsa {
    private Salt salt;
    private Pepper pepper;
    private Tomato tomato;
    private List<ChickenEgg> eggs;
    private SweetPepper sweetPepper;

    public Yaishnitsa() {
    }

    public Yaishnitsa(Salt salt, Pepper pepper, Tomato tomato, List<ChickenEgg> eggs, SweetPepper sweetPepper) {
        this.salt = salt;
        this.pepper = pepper;
        this.tomato = tomato;
        this.eggs = eggs;
        this.sweetPepper = sweetPepper;
    }

    public Salt getSalt() {
        return salt;
    }

    public void setSalt(Salt salt) {
        this.salt = salt;
    }

    public Pepper getPepper() {
        return pepper;
    }

    public void setPepper(Pepper pepper) {
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
