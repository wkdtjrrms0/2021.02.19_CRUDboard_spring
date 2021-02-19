package controller;

import mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class TestController {
    @Autowired //빈주입해주는 어노테이션, 빈 주입할때는 xml과 어노테이션이 있는데 xml은 빈만들고 주입하게 번거롭다. 비즈니스로직에서는 @Autowired를 넣으면 스프링이 알아서 자료형에 맞춰서 넣어준다..
    private TestMapper testMapper;

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){ return "good working"; }


    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public List<String> select(){
        return testMapper.select();
    }

    @ResponseBody
    @RequestMapping(value = "/insertyoung", method = RequestMethod.GET)
    public String insertyoung(){
        testMapper.insertyoung();
        return "Successful Insert Data";
    }
    @ResponseBody
    @RequestMapping(value = "/insertold", method = RequestMethod.GET)
    public String insertold(){
        testMapper.insertold();
        return "Successful Insert Data";
    }

    @ResponseBody
    @RequestMapping(value = "/updateyoung", method = RequestMethod.GET)
    public String updateyoung(){
        testMapper.updateyoung();
        return "Successful Update Data";
    }
    @ResponseBody
    @RequestMapping(value = "/updateold", method = RequestMethod.GET)
    public String updateold(){
        testMapper.updateold();
        return "Successful Update Data";
    }


    @ResponseBody
    @RequestMapping(value = "/deleteyoung", method = RequestMethod.GET)
    public String deleteyoung(){
        testMapper.deleteyoung();
        return "Successful Delete Data";
    }
    @ResponseBody
    @RequestMapping(value = "/deleteold", method = RequestMethod.GET)
    public String deleteold(){
        testMapper.deleteold();
        return "Successful Delete Data";
    }
}
