package com.zhang.mvc.web;

import com.zhang.mvc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.mvc.web
 * @date:2021/1/12
 */

@SessionAttributes(value = {"user"},types = {String.class})
@Controller
public class TestController {

    @Autowired
    private ResourceBundleMessageSource messageSource;

//    @ModelAttribute
//    public void modelAttribute(Map<String,Object> map){
//        User user = new User("1","13","2",12,"ss");
//        map.put("user",user);
//        System.out.println(user);
//    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println(user);

        return "success";
    }

    @RequestMapping("/hello.do")
    public String test(){

        return "success";
    }

    @RequestMapping(value = "/test/get/{id}",method = RequestMethod.GET)
    public String test01(@PathVariable("id") Integer id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "/test/post",method = RequestMethod.POST)
    public String test01(){
        System.out.println("post请求");
        return "success";
    }

    @RequestMapping(value = "/test/delete/{id}",method = RequestMethod.DELETE)
    public String test02(@PathVariable("id") Integer id){
        System.out.println("delete请求"+id);
        return "success";
    }

    @RequestMapping(value = "/test/put/{id}",method = RequestMethod.PUT)
    public String test03(@PathVariable("id") Integer id){
        System.out.println("put请求"+id);
        return "success";
    }

    @RequestMapping(value = "/testParam",method = RequestMethod.GET)
    public String test04(@RequestParam(value = "id",defaultValue = "1",required = false) Integer id){
        System.out.println("RequestParam请求"+id);
        return "success";
    }

    @RequestMapping(value = "/testHeader")
    public String test05(@RequestHeader(value = "Accept-Language") String id){
        System.out.println("RequestHeader请求"+id);
        return "success";
    }

    @RequestMapping(value = "/testCookie")
    public String test06(@CookieValue(value = "JSESSIONID") String sessionId){
        System.out.println("CookieValue请求"+sessionId);
        return "success";
    }


    @RequestMapping(value = "/testPojo")
    public String test06(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping(value = "/testMap")
    public String test07(Map<String,Object> map){
        map.put("map","mapTest");
        return "success";
    }

    @RequestMapping(value = "/testMaModel")
    public String test07(Model model){
        model.addAttribute("model","modelTest");
        return "success";
    }

    @RequestMapping(value = "/testSession")
    public String test07(HttpSession session,Map<String,Object> map){

        session.setAttribute("session","sessionTest");
        User user = new User("1","12","2",12,"ss");
        map.put("user",user);
        map.put("mapAndSession","mapAndSessionTest");

        return "success";
    }

    /*
    * 自定义视图
    * */

    @RequestMapping("/myView")
    public String myView1(){

        return "myView";
    }

    /**
     * 重定向
     */
    @RequestMapping("/testRedirect")
    public String redirect(){
        System.out.println("test_Redirect");
        return "redirect:/testMap";
    }

    /**
     * i18n-mvc-国际化
     */

    @RequestMapping("/testI18n")
    public String i18n(){

        return "i18n1";
    }


    /**
     * 文件上传
     */


    @RequestMapping("/testFileUpload")
    public String testFileUpload(@RequestParam("desc") String desc,
                                 @RequestParam("file") MultipartFile file) throws IOException{
        System.out.println("desc: " + desc);
        System.out.println("OriginalFilename: " + file.getOriginalFilename());
        System.out.println("InputStream: " + file.getInputStream());
        byte[] bytes = file.getBytes();
        InputStream inputStream = file.getInputStream();
        FileOutputStream outputStream=new FileOutputStream("E:\\21.txt");
        int a;
        while ((a=inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,a);
        }
        file.transferTo(new File("E:\\2.txt"));
        return "success";
    }


    /**
     * 文件下载
     *
     *
     */
    @RequestMapping("/testxiazai")
    public ResponseEntity<byte[]> testxiazai(HttpSession session) throws IOException {
        ServletContext servletContext = session.getServletContext();
        InputStream in = servletContext.getResourceAsStream("/112.txt");
        byte[] bytes =null;
        bytes = new byte[in.available()];
        FileOutputStream outputStream=new FileOutputStream("E:\\22.txt");
        int a;
        while ((a=in.read(bytes))!=-1){
            outputStream.write(bytes,0,a);
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("content-Disposition","attachment,filename=112.txt");
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(bytes,httpHeaders,HttpStatus.OK);

        return responseEntity;

    }

    /**
     * mvc:异常：
     */
    @RequestMapping("/testException")
    public String testException(@RequestParam("number") Integer number){

        System.out.println(10/number);
        return "success";
    }


//    @ExceptionHandler(value = {ArithmeticException.class})
//    public String arithmeticException(Exception e,Model model){
//        System.out.println(e+"ArithmeticException");
//        model.addAttribute("exception",e);
//        return "error";
//    }
//
//    @ExceptionHandler(value = {RuntimeException.class})
//    public String arithmeticException1(Exception e,Model model){
//        System.out.println(e+"RuntimeException");
//        model.addAttribute("exception",e);
//        return "error";
//    }

}
