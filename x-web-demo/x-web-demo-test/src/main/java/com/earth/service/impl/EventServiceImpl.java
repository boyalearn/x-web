package com.earth.service.impl;

import com.earth.entity.Event;
import com.earth.mapper.EventMapper;
import com.earth.service.IEventService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xweb.common.utils.PageUtil;
import com.xweb.common.utils.StringUtils;
import com.xweb.common.web.standard.PageEntity;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhx
 * @since 2024-09-25
 */
@Service
public class EventServiceImpl extends ServiceImpl<EventMapper, Event> implements IEventService {

    @Override
    public PageEntity listEvents() {
        return PageUtil.buildResult(list());
    }

    @Override
    public Event addEvent(Event event) {
        if (null == event.getId()) {
            save(event);
        } else {
            updateById(event);
        }
        return event;
    }
}
