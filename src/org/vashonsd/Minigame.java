package org.vashonsd;

public abstract class Minigame {
    String keyword;
    String description;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void play();

    public Minigame(String keyword, String description) {
        this.keyword = keyword;
        this.description = description;
    }
}
