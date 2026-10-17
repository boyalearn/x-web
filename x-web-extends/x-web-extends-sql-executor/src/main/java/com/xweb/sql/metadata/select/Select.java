package com.xweb.sql.metadata.select;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Select {

    private List<SelectItem> selectItems = new ArrayList<>();

    private List<TableItem> tableItems = new ArrayList<>();

    private List<WhereItem> whereItems = new ArrayList<>();
}
