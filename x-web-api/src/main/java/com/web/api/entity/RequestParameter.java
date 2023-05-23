package com.web.api.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class RequestParameter {

    private List<String> nameList;

    private String[] names;

}
