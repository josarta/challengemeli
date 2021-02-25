package com.meli.challenge.message.domain;

import java.util.List;

public class Message  {
    private List<List<String>> content;

    public Message(List<List<String>> content) {
        this.content = content;
    }

    public List<List<String>> getMessage() {
        return content;
    }

    public int count() {
        return content.size();
    }
}
