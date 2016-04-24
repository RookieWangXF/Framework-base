package cn.rookie.service.impl;

import cn.rookie.bean.Axe;
import cn.rookie.service.IAxeService;
import cn.rookie.service.IPersonService;
import org.apache.log4j.Logger;


/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.service.impl
 * Description:
 */
public class CNPersonImpl implements IPersonService {
    private static Logger logger = Logger.getLogger(CNPersonImpl.class);
    private IAxeService axe;

    public void setAxe(IAxeService axe) {
        this.axe = axe;
    }
    @Override
    public void useAxe() {
        logger.info("[axe]:"+axe);
        System.out.println(axe.chop());
    }
}
