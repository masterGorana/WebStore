/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author User
 */
@Controller
public class ProductController {
    
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String newForm(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("newProduct", new Product());
        model.addAttribute("newProducts", Product.allProducts());

        return "product";
    }
}

