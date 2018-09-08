package com.netcar.chauffeur.router.routings;

/**
 * @author haoge on 2018/1/5.
 */

public interface NewsRouting extends IRouting{
    String NEWS_LIST = PREFIX + "zhihu_news/list";
    String NEWS_DETAIL = PREFIX + "zhihu_news/detail";
}
