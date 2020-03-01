package com.xxxy.erer15.base.result;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * 分页查询参数
 */
@Slf4j
@Data
public class PageTableRequest implements Serializable {

    private static final long serialVersionUID = 7328071045193618467L;
    private Integer page;
    private Integer limit;
    private Integer offset;

    /**
     * 页面显示多少数据
     * 计算方法
     */
    public void countOffset() {
		if (null == this.page || null == this.limit) {
            this.offset = 0;
            return;
        }
		this.offset = (this.page - 1) * this.limit;
    }

    /**
     * 显示格式
     * @retur page limit offset
     */
    @Override

    public String toString() {
        return "PageTableRequest{" +
                "page=" + page +
                ", limit=" + limit +
                ", offset=" + offset +
                '}';
    }
}
