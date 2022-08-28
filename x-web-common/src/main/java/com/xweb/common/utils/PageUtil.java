package com.xweb.common.utils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xweb.common.standard.PageEntity;
import com.xweb.common.standard.PageRequest;

import java.util.List;
import java.util.Optional;

public class PageUtil {

    public static void startPage(PageRequest request) {
        if (!Optional.ofNullable(request).isPresent()) {
            return;
        }
        if (!Optional.ofNullable(request.getPage()).isPresent() || !Optional.ofNullable(request.getPageSize()).isPresent()) {
            return;
        }
        PageHelper.startPage(request.getPage().intValue(), request.getPageSize().intValue());
    }

    public static void endPage() {
        PageHelper.clearPage();
    }

    public static PageEntity buildResult(List dataQualityRules) {
        PageInfo pageInfo = new PageInfo(dataQualityRules);
        PageEntity pageEntity = new PageEntity();
        pageEntity.setList(pageInfo.getList());

        pageEntity.setPage(Long.valueOf(pageInfo.getPageNum()));
        pageEntity.setPageSize(Long.valueOf(pageInfo.getPageSize()));

        pageEntity.setTotal(pageInfo.getTotal());
        return pageEntity;
    }
}
