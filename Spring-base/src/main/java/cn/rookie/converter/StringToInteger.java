package cn.rookie.converter;


import org.springframework.core.convert.converter.Converter;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by Rookie on 2016/6/1.
 * Package_name is cn.rookie.converter
 * Description:
 */
public class StringToInteger implements Converter<String,Integer> {


    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }
}
