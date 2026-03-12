package com.codesquadz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CodesquadzRestController {
	
	@RequestMapping("/insert")  
    public String index(){  
        return"controller logic executed successfully...!!";  
    }  

}
