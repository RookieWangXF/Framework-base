package cn.rookie.service.impl;

import cn.rookie.service.IAxeService;
import cn.rookie.service.IPersonConService;
import org.apache.log4j.Logger;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.service.impl
 * Description:
 */
public class PersonConServiceImpl implements IPersonConService {
    private static Logger logger = Logger.getLogger(PersonConServiceImpl.class);

    private IAxeService axe;

    public PersonConServiceImpl(IAxeService axe) {
        this.axe = axe;
    }

    @Override
    public void useAxe() {
        logger.info("[PersonConServiceImpl] 使用构造函数注入值");
        System.out.println(axe.chop());
    }
}
