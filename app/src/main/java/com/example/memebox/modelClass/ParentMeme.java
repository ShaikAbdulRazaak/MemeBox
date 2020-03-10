package com.example.memebox.modelClass;

import java.util.List;

public class ParentMeme {
    private int count;
    private List<memes> memes;

    public ParentMeme(int count, List<memes> memes) {
        this.count = count;
        this.memes = memes;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<memes> getMemes() {
        return memes;
    }

    public void setMemes(List<memes> memes) {
        this.memes = memes;
    }
}
