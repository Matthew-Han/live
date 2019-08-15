package xyz.yuanmo.live.bulletscreen.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.pagehelper.PageInfo;
import lombok.*;

/**
 * @ClassName PageModel
 * @Description 基于gayHub的pageHelper
 * @Author MatthewHan
 * @Date 2019/4/30 6:55 PM
 * @Version 1.0
 **/
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
@AllArgsConstructor
@NoArgsConstructor
public class PageModel extends PageInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页
     */
    private int pageNum;

    /**
     * 每页的数量
     */
    private int pageSize;

    /**
     * 总页数
     */
    private int pages;

    private long totalNum;

    public PageModel(PageInfo<?> pageInfo) {
        setPageNum(pageInfo.getPageNum());
        setPages(pageInfo.getPages());
        setPageSize(pageInfo.getPageSize());
        setTotalNum(pageInfo.getTotal());
    }


}
