package com.blueMorphoST;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/dice")
public class RoleDiceController {

    private static final String template = "The result is, %s!";
    private static List<Integer> listOfDice;

    @RequestMapping(value="/dice", method=RequestMethod.POST)
    public @ResponseBody
    RoleDice returnResult(@RequestParam(value="dice", required=false, defaultValue="0") List<Integer> listOfDice) {
        return new RoleDice(listOfDice);
    }


    @RequestMapping(value="/quote", method = RequestMethod.GET)
    public @ResponseBody
    ProvideQuote returnQuote(@RequestParam(value = "quote", required = false, defaultValue = "0") String quote) {
        return new ProvideQuote();
    }

}

