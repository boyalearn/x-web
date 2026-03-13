package com.earth.service;

import com.earth.entity.Event;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xweb.common.web.standard.PageEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhx
 * @since 2024-09-25
 */
public interface IEventService extends IService<Event> {

    PageEntity listEvents();

    Event addEvent(Event event);
}
