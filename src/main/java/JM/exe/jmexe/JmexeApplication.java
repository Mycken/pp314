package JM.exe.jmexe;

import JM.exe.jmexe.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class JmexeApplication {

	public static void main(String[] args) {

		SpringApplication.run(JmexeApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		String cookie;

//	Запрос на получение всех юзеров
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<String> response = restTemplate.exchange("http://91.241.64.178:7081/api/users", HttpMethod.GET, entity, String.class);
		System.out.print("Заголовок Set-Cookie: ");// Определяем значение заголовка Set-Cookie
		System.out.println(cookie = response.getHeaders().get("Set-Cookie").toString().substring(1,62));//

//	Добаление нового юзера
		User user = new User(3L,"James","Brown",(byte)50);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("Set-Cookie",cookie);
		HttpEntity<User> entity1 = new HttpEntity<>(user,headers);
		System.out.println("Запрос на добавление = user+header: " +  entity1);

		ResponseEntity<String> response1 = restTemplate.exchange("http://91.241.64.178:7081/api/users", HttpMethod.POST, entity1, String.class);
		//Получаем первую часть кода  5ebfeb
		System.out.println("Первая часть кода: "+response1.getBody());

//  Запрос на изменение юзера
		user.setName("Thomas");
		user.setLastName("Shelby");
		HttpEntity<User> entity2 = new HttpEntity<>(user,headers);
		System.out.println("Запрос на изменение = user+header: " +  entity2);

		ResponseEntity<String> response2 = restTemplate.exchange("http://91.241.64.178:7081/api/users/", HttpMethod.POST, entity2, String.class);
		// Получаем вторую часть кода cea2a2
		System.out.println("Вторая часть кода: " + response2.getBody());

//  Запрос на удаление юзера

//		Map< String, String > params = new HashMap< String, String >();
//		params.put("?id", "3");
//		HttpEntity<Map> entity3 = new HttpEntity<Map>(params,headers);
		System.out.println("Запрос на удаление = header: " +  entity2);

		ResponseEntity<String> response3 = restTemplate.exchange("http://91.241.64.178:7081/api/users/3", HttpMethod.DELETE, entity, String.class);

// Получаем третью часть кода. Зависит от цифры в url: /1 - dbadfc если /2 - bbd25d /3 - ошибка
		System.out.println("Третья часть кода: " + response3.getBody());
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
