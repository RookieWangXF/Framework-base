package cn.rookie.annotation;

import cn.rookie.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.annotation
 * Description:使用java类进行配置
 */
@Configuration
public class Appconfig {
    @Value("孙悟空")
    String personName;


}

