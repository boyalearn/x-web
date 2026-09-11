package com.xweb.actor.message;

import lombok.Data;

@Data
public class SetRequest {
    private final String key;
    private final Object value;

    public SetRequest(String key, Object value) {
        this.key = key;
        this.value = value;
    }
}
