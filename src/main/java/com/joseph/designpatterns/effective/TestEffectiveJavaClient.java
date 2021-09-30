package com.joseph.designpatterns.effective;

import com.joseph.designpatterns.effective.item2.Person;
import com.joseph.designpatterns.effective.item3.Singleton3;
import com.joseph.designpatterns.effective.item5.Lexicon;
import com.joseph.designpatterns.effective.item5.SpellChecker3;

/**
 * @author Joseph.Liu
 */
public class TestEffectiveJavaClient {
    public static void main(String[] args) {
        Person person = new Person.Builder("Joseph","Liu").age(40).height(190).build();

        Singleton3 singleton3 = Singleton3.INSTANCE;
        singleton3.doSomething();

        SpellChecker3 spellChecker3 = new SpellChecker3(Lexicon::new);
    }
}
