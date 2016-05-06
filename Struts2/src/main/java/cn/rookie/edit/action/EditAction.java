package cn.rookie.edit.action;

import cn.rookie.edit.model.Person;
import cn.rookie.edit.model.State;
import cn.rookie.edit.sercive.CarModelsService;
import cn.rookie.edit.sercive.EditService;
import cn.rookie.edit.sercive.impl.CarModelsServiceImpl;
import cn.rookie.edit.sercive.impl.EditServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rookie on 2016/5/6.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class EditAction extends ActionSupport implements Preparable{
    private static final long serialVersionUID = 1L;
    private static Logger log = LogManager.getLogger(EditAction.class);

    private EditService editService = new EditServiceImpl();

    private CarModelsService carModelsService = new CarModelsServiceImpl();
    @Valid
    private Person personBean;

    private String[] sports = {"football", "baseball", "basketball"};

    private String [] genders = {"male", "female", "not sure" };

    private List<State> states;

    private String [] carModelsAvailable;

    @Override
    public void prepare() throws Exception {
        log.info("In prepare method...");
        carModelsAvailable = carModelsService.getCarModels();
        setPersonBean(editService.getPerson());
    }
    @Override
    public String execute() throws Exception {

        editService.savePerson( getPersonBean() );

        return super.execute();
    }


    public String input() {
        log.info("In input method...");
        return INPUT;
    }

    public Person getPersonBean() {

        return personBean;

    }

    /**
     * 通过页面注入值
     * @param person
     */
    public void setPersonBean(Person person) {

        personBean = person;

    }


    public List<String> getSports() {
        return Arrays.asList(sports);
    }

    public List<String> getGenders() {

        return Arrays.asList(genders);

    }



    public List<State> getStates() {

        states = new ArrayList<State>();
        states.add( new State("AZ", "Arizona") );
        states.add( new State("CA", "California") );
        states.add( new State("FL", "Florida") );
        states.add( new State("KS", "Kansas") );
        states.add( new State("NY", "New York") );

        return states;
    }



    public String [] getCarModelsAvailable() {
        return carModelsAvailable;
    }


}
