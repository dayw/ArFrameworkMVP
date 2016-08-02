package pathdemo.dayw.com.frameworkmvp.view;

import java.util.List;

import pathdemo.dayw.com.frameworkmvp.bean.NewsBean;

/**
 * Created by WangDayong on 16/8/2.
 */
public interface NewsView {
    void showProgress();
    void addNews(List<NewsBean> newsList);
    void hideProgress();
    void showLoadFailMsg();
}
