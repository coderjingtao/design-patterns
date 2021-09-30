package com.joseph.designpatterns.effective.item5;

import java.util.Objects;

/**
 * 优先使用依赖注入:静态工厂
 * @author Joseph.Liu
 */
public class SpellChecker2 {
    private final Lexicon dictionary;

    private SpellChecker2(Lexicon dictionary){
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public static SpellChecker2 getInstance(Lexicon dictionary){
        return new SpellChecker2(dictionary);
    }
}
