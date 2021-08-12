package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Calculator {

    @GetMapping("/")
    String getIndex() {
        return "index.jsp";
    }

    @PostMapping("/calculator")
    String calculatorR(HttpServletRequest request, Model model) {
        float firstOperand = Float.parseFloat(request.getParameter("first"));
        float secondOperand = Float.parseFloat(request.getParameter("second"));
        char operator = request.getParameter("operator").charAt(0);
        float Result = Calculator.calculator(firstOperand, secondOperand, operator);
        model.addAttribute("Result", Result);
        return "index.jsp";
    }

    public static float calculator(float firstOperand , float secondOperand , char operator ) {
        switch (operator ) {
            case '+':
                return firstOperand  + secondOperand ;
            case '-':
                return firstOperand  - secondOperand ;
            case '*':
                return firstOperand  * secondOperand ;
            case '/':
                if (secondOperand  != 0)
                    return firstOperand  / secondOperand ;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}