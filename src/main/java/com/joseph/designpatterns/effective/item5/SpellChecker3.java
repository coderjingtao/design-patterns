package com.joseph.designpatterns.effective.item5;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * 优先使用依赖注入:注入工厂
 * @author Joseph.Liu
 */
public class SpellChecker3 {

    private final Lexicon dictionary;

    public SpellChecker3(Supplier<? extends Lexicon> dictionaryFactory){
        this.dictionary = Objects.requireNonNull(dictionaryFactory).get();
    }
}
