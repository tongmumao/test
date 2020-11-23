package com.chen.Controller;

import com.chen.Dao.testDao;
import com.chen.Pojo.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    testDao testDao;

    @GetMapping("/find")
    public List<test> findAll(){
        List<test> l=testDao.findAll();
        System.out.println(l);
        return l;
    }

    @GetMapping("/find/{id}")
    public List<test> findById(@PathVariable("id") Integer id){
        List<test> l=testDao.findById(id);
        System.out.println(l);
        return l;
    }
}
