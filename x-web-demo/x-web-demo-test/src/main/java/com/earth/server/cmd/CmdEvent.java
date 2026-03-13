package com.earth.server.cmd;

import com.earth.entity.Meta;
import com.earth.server.evt.Events;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CmdEvent {
    private Events event;
    private int cmd;
    private Meta meta;
}
