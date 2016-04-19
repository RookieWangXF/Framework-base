package cn.rookie.framework.bean;

import com.sun.org.apache.regexp.internal.RE;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Rookie on 2016/4/19.
 * 加载配置文件信息
 */
public class ActionMappingManager {
    private Map<String, ActionMapping> allActions = null;

    public ActionMappingManager() {
        allActions = new HashMap<String, ActionMapping>();
        this.init();
    }

    /**
     * 读取配置文件的方法
     */
    private void init() {
        try {
            SAXReader reader = new SAXReader();
            InputStream inputStream = this.getClass().getResourceAsStream("struts.xml");
            Document doc = reader.read(inputStream);

            Element root = doc.getRootElement();
            Element ele_package = root.element("package");
            List<Element> actionList = ele_package.elements("action");

            for (Element ele_action : actionList) {
                ActionMapping actionMapping = new ActionMapping();
                actionMapping.setActionName(ele_action.attributeValue("name"));
                actionMapping.setClassName(ele_action.attributeValue("class"));
                actionMapping.setMethodName(ele_action.attributeValue("method"));


                Map<String, Result> results = new HashMap<String, Result>();
                Iterator<Element> iter = ele_action.elementIterator(); //默认所有的子标签都为result
                while (iter.hasNext()) {
                    Element ele_result = iter.next();
                    Result result = new Result();
                    result.setName(ele_result.attributeValue("name"));
                    result.setPage(ele_result.attributeValue("type"));
                    result.setType(ele_result.getTextTrim());
                    results.put(result.getName(), result);
                }
                actionMapping.setResults(results);

                allActions.put(actionMapping.getActionName(), actionMapping);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ActionMapping getActionMapping(String actionName){
        if (actionName == null){
            throw new RuntimeException("传入参数不正确，请查看struts.xml配置的路径，actionName为null");
        }
        ActionMapping actionMapping = allActions.get(actionName);
        if (actionMapping == null){
            throw new RuntimeException("配置文件有错误，找不到要处理的action类");
        }
        return actionMapping;
    }
}
