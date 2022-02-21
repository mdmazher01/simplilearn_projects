package com.ecommerce.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.dao.EProductDao;
import com.ecommerce.entity.EProduct;

@Controller
public class MainController {

        
        
           @Autowired    
            EProductDao eproductDAO;    
           @RequestMapping(value = "/listProducts", method = RequestMethod.GET)
            public String listProducts(ModelMap map)
            {
                    List<EProduct> list= eproductDAO.getProducts();
                model.addAttribute("list",list);  
                return "listProducts";
            }
           }
