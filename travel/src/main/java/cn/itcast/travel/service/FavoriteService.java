package cn.itcast.travel.service;


public interface FavoriteService {
    /**
     * 判断是否收藏的方法
     * @param rid
     * @param uid
     * @return
     */
    public boolean isFavorite(String rid, int uid);
}
