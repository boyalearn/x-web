package com.earth.controller;


import com.earth.entity.Event;
import com.earth.service.IEventService;
import com.xweb.common.web.response.RespPageResult;
import com.xweb.common.web.response.RespResult;
import com.xweb.common.web.standard.PageEntity;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhx
 * @since 2024-09-25
 */
@RestController
@AllArgsConstructor
@RequestMapping("/events")
public class EventController {

    private IEventService eventService;

    @PostMapping
    public RespResult<Event> addEvent(@RequestBody Event event) {
        return RespResult.builder().data(eventService.addEvent(event)).build();
    }

    @GetMapping
    public RespPageResult<PageEntity<Event>> listEvents() {
        return RespPageResult.builder().data(eventService.listEvents()).build();
    }
}

