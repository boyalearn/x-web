package com.earth.server.evt;

import com.xweb.common.web.standard.IEnum;

public enum Events implements IEnum {

    META_ADD(1), META_LEAVE(2), META_CMD(3), META_NEXT(4), META_NULL(5), META_SYNC(6);

    private int index;

    Events(int index) {
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }
}
