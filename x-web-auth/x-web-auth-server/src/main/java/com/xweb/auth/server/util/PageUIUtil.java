package com.xweb.auth.server.util;

import com.xweb.common.standard.PageEntity;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageUIUtil {

    private static final String PAGE_INFO_KEY = "pages";

    private static final String PAGE = "?page=";

    private static final String PAGE_SIZE = "&page_size=";

    private static final String FIRST = "<<";

    private static final String END = ">>";

    private static final String TAG = "tag";

    private static final String URL = "url";


    public static void buildPageInfo(String uri, PageEntity pageInfo, ModelAndView modelAndView) {
        List<Map> arr = new ArrayList<>();
        Map<String, Object> item = new HashMap<>();
        item.put(TAG, FIRST);
        item.put(URL, uri + PAGE + 1 + PAGE_SIZE + pageInfo.getPageSize());
        arr.add(item);

        long totalPage = (pageInfo.getTotal() + pageInfo.getPageSize()-1) / pageInfo.getPageSize();
        if (totalPage <= 5 || pageInfo.getPage() <= 3) {
            for (long i = 0; i < totalPage; i++) {
                item = new HashMap<>();
                long index = i + 1;
                item.put(TAG, index);
                item.put(URL, uri + PAGE + index + PAGE_SIZE + pageInfo.getPageSize());
                arr.add(item);
            }
        } else if (pageInfo.getPage() < totalPage - 2 && totalPage >= 5) {
            for (long i = pageInfo.getPage() - 2; i < pageInfo.getPage() + 2; i++) {
                item = new HashMap<>();
                long index = i + 1;
                item.put(TAG, index);
                item.put(URL, uri + PAGE + index + PAGE_SIZE + pageInfo.getPageSize());
                arr.add(item);
            }
        } else {
            for (long i = totalPage - 4; i <= totalPage; i++) {
                item = new HashMap<>();
                long index = i + 1;
                item.put(TAG, index);
                item.put(URL, uri + PAGE + index + PAGE_SIZE + pageInfo.getPageSize());
                arr.add(item);
            }
        }
        item = new HashMap<>();
        item.put(TAG, END);
        item.put(URL, uri + PAGE + totalPage + PAGE_SIZE + pageInfo.getPageSize());
        arr.add(item);
        modelAndView.addObject(PAGE_INFO_KEY, arr);
    }
}
