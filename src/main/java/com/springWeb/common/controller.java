package com.springWeb.common;

import com.springWeb.domain.SampleDTO;
import com.springWeb.domain.SampleDTOList;
import com.springWeb.domain.TodoDTO;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Controller
@Log4j
public class controller {
    @RequestMapping("/")
    public String showPage(Model model) {
        log.info("index>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        model.addAttribute("serverTime", new java.util.Date());
        return "index";
    }

    @RequestMapping("/hello")
    public void showPageHello() {
        log.info("hello>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }

    @GetMapping("/ex02")
    public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
        log.info("ex02>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info(name);
        log.info(age);
        log.info("ex02 end>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return "ex02";
    }

    @GetMapping("/ex02list")
    public String ex02(@RequestParam("ids") ArrayList<String> ids) {
        log.info("ex02list>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info("ids:" + ids);
        log.info("ex02listend>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return "ex02";
    }

    @GetMapping("/ex02dtolist")
    public void ex02dtolist(SampleDTOList list) {
        log.info("dtolist>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info("list: " + list);
        log.info("dtolistend>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    @GetMapping("/ex03")
    public void ex03(TodoDTO todo) {
        log.info("todo:" + todo);
    }

    @GetMapping("/ex04")
    public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
        log.info("ex04>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info("dto: " + dto);
        log.info("page: " + page);
        return "ex04";
    }

    @PostMapping("/uploadPost")
    public void fileUpload(ArrayList<MultipartFile> files) {
        files.forEach(
                file -> {
                    log.info("file_upload>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    log.info("name: " + file.getOriginalFilename());
                    log.info("size: " + file.getSize());
                }
        );
    }

    @GetMapping("/fileUploadPage")
    public void showPageFileUpload() {
    }
}
