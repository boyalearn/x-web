package com.web.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class RequestParameter {

    @JsonIgnore
    private List<String> nameList;

    private String[] names;

}
