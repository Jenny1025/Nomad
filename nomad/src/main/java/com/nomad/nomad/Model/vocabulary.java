package com.nomad.nomad.Model;

import lombok.Data;

@Data
public class vocabulary {

    private int id;
    private String content;

    public vocabulary(int id, String content) {
        super();
        this.id = id;
        this.content = content;

    }
}
