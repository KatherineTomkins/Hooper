import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>[Pattern] to provide the following to {@link Object}:</p>
 * <ul>
 * <li></li>
 * </ul>
 * <p>Example:</p>
 * <pre>
 * </pre>
 *
 * @since 0.0.1
 * �
 */
@RestController
@EnableAutoConfiguration
public class BasicRestController {

  @RequestMapping("/rest")
  String home(){
    return "REST hello world";
  }

  @RequestMapping(value="/asjson", produces = {MediaType.APPLICATION_JSON_VALUE})
  Map<String, Double> asJson() {
    Map<String, Double> results = new HashMap<>();
    results.put("pi", Math.PI);
    results.put("e", Math.E);
    return results;
  }

  @RequestMapping(value="/asxml", produces = {MediaType.APPLICATION_XML_VALUE})
  Map<String, Double> asXml() {
    Map<String, Double> results = new HashMap<>();
    results.put("pi", Math.PI);
    results.put("e", Math.E);
    return results;
  }

  @RequestMapping("/hello/{name}")
  String hello(@PathVariable String name){
    return "PATH hello "+name;
  }
  @RequestMapping(value = "greet/{greeting}/{name}", method=RequestMethod.GET)
String greet(@PathVariable String greeting, @PathVariable String name){
    return String.format("GREET %s %s", greeting, name);
  }

  public static void main(String[] args)throws Exception{
    SpringApplication.run(BasicRestController.class, args);

  }
}

