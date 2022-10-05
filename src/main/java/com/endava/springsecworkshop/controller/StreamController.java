package com.endava.springsecworkshop.controller;

import com.endava.springsecworkshop.entities.dto.EmployeeDto;
import com.endava.springsecworkshop.service.StreamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StreamController {

    private static StreamService streamService;


}
