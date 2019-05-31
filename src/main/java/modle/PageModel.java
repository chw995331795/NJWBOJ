package modle;

import java.util.List;

public class PageModel <T> {

    //每页条数
    private int pageSize;
    //页码
    private int pageNo;
    //总条数
    private int cnt;
    //数据集
    private List<T> dataList;

    //获取首页
    public int getFirstPage (){
        return 1;
    }
    //获取上一页
    public int getPrePage(){
        if(pageNo<=1){
            return 1;
        }else{
            return pageNo-1;
        }
    }
    //获取下一页
    public int getNextPage(){
        if(pageNo>=getTotalPage()){
            return getTotalPage();
        }else{
            return pageNo+1;
        }

    }
    //获取总页码
    //取余，不为0说明要占另一页
    public int getTotalPage(){
        if(cnt%pageSize==0){
            return cnt/pageSize;
        }else{
            return cnt/pageSize+1;
        }
    }
    //获取尾页
    public int getLastPage(){
        return getTotalPage();
    }
    //从前台获取页数
    public static int getPageFromClient(String clientPage){
        int page=1;
        if(null!=clientPage){
            page=Integer.valueOf(clientPage);
            if(page<1){
                page=1;
            }
        }
        return page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
