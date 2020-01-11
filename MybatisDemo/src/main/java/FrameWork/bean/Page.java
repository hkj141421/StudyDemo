package FrameWork.bean;

import java.util.HashMap;

/**
 * Created by forget on 2019/9/29.
 * 分页实体类
 */
public class Page {
    //分页sql
    private String sql;
    //总页数
    private Integer totalPage=0;
    //当前页数,默认当前页数为1
    private Integer indexPage=1;
    //每页页数，默认页数为10
    private Integer pageNum=10;
    //查询参数
    private HashMap<String,Object> params=new HashMap();

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer total) {
        this.totalPage = total%this.pageNum==0?total/this.pageNum:total/this.pageNum+1;
    }

    public Integer getIndexPage() {
        return indexPage;
    }

    public void setIndexPage(Integer indexPage) {
        this.indexPage = indexPage;
    }

    public Object getParamsMap(String key) {
        return this.params.get(key);
    }

    public void setParamsMap(String key,Object value) {
        this.params.put(key,value);
    }

    public HashMap<String, Object> getParams() {
        return params;
    }

    public void setParams(HashMap<String, Object> params) {
        this.params = params;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
