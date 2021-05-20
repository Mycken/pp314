package JM.exe.jmexe.controller;

import JM.exe.jmexe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


@RestController
public class UserRestService {

//    private String cookie;
//
//    @Autowired
//    RestTemplate  restTemplate;
//
//
//    @RequestMapping(value = "/temp/users", method = RequestMethod.GET)
//    public String getUsersList() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity <String> entity = new HttpEntity<>(headers);
//        ResponseEntity<String> response = restTemplate.exchange("http://91.241.64.178:7081/api/users", HttpMethod.GET, entity, String.class);
//        System.out.println(cookie = response.getHeaders().get("Set-Cookie").toString());//.substring(1,62)
//        System.out.println(response.getHeaders());
//        return response.getBody();
//    }
//
//    @RequestMapping(value = "/temp/add",method = RequestMethod.GET)
//    public String createUser() {
//        User user = new User(3L,"James","Brown",(byte)50);
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        headers.set("Set-Cookie",cookie);
//        HttpEntity<User> entity = new HttpEntity<>(user,headers);
//        System.out.println("---" +  entity);
//
//        ResponseEntity<String> response = restTemplate.exchange("http://91.241.64.178:7081/api/users", HttpMethod.POST, entity, String.class);
////        System.out.println(cookie=response.getHeaders().get("Set-Cookie").toString().substring(1,62));
//        System.out.println("1 part: "+response.getBody());//5ebfeb
////        System.out.println("New coockie - " + cookie);
//
//        user.setName("Thomas");
//        user.setLastName("Shelby");
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        headers.set("Set-Cookie",cookie);
//        HttpEntity<User> entity1 = new HttpEntity<>(user,headers);
//        System.out.println("---" +  entity1);
//
//        response = restTemplate.exchange("http://91.241.64.178:7081/api/users", HttpMethod.POST, entity1, String.class);
////        System.out.println(cookie=response.getHeaders().get("Set-Cookie").toString().substring(1,62));
//        System.out.println("2 part: "+response.getBody());// cea2a2
//
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        headers.set("Set-Cookie",cookie);
//        Map< String, String > params = new HashMap< String, String >();
//        params.put("id", "3");
//        HttpEntity<Map> entity2 = new HttpEntity<Map>(params,headers);
//        System.out.println("---" +  entity2);
//
//        response = restTemplate.exchange("http://91.241.64.178:7081/api/users/3", HttpMethod.DELETE, entity2, String.class);
////        restTemplate.delete("http://91.241.64.178:7081/api/users/3");
////        User u = restTemplate.getForObject("http://91.241.64.178:7081/api/users/3",User.class);
//
//        System.out.println("3 part: "+response.getBody());//dbadfc/ bbd25d
//
//        return response.getBody();
//    }
//
//    @RequestMapping(value = "/temp/del",method = RequestMethod.GET)
//    public void deleteUser() {
//        Map< String, String > params = new HashMap< String, String >();
//        params.put("id", "1");
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        headers.set("Set-Cookie",cookie);
//        System.out.println("Запрос на удаление = header: " +  params);
//
//        restTemplate.delete("http://91.241.64.178:7081/api/users/{id}", params);
//
//    }
}
