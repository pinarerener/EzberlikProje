package com.ezberlik.grupbes.ezberlikproje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Word extends AppCompatActivity {

    private String word;
    private String meaning;
    private String[] allAnswers;
    private int level;

    public Word(String word, String meaning, String[] otherAnswers, int level) {
        this.word = word;
        this.meaning = meaning;
        this.allAnswers = otherAnswers;
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String[] getOtherAnswers() {
        return allAnswers;
    }

    public void setOtherAnswers(String[] otherAnswers) {
        this.allAnswers = otherAnswers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word1 = (Word) o;

        return word != null ? word.equals(word1.word) : word1.word == null;

    }

}
