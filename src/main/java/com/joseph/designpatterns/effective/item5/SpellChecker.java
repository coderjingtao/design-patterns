package com.joseph.designpatterns.effective.item5;

import java.util.List;
import java.util.Objects;

/**
 * 优先使用依赖注入:构造函数
 * @author Joseph.Liu
 */
public class SpellChecker {

    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary){
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public List<String> suggestions(String typo){
        return null;
    }
}
