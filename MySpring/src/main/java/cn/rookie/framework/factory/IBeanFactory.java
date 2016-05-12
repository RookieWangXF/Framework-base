package cn.rookie.framework.factory;

/**
 * Created by Rookie on 2016/5/12.
 * Package_name is cn.rookie.framework.factory
 * Description:容器类，标识容器应有的方法
 */
public interface IBeanFactory {

    public Object getBean(String idStr);

    <T> T getBean(String idStr,Class<T> requireType);

    public boolean isContain(String idStr);


}
