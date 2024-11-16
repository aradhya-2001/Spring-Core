package BeanViaXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

    public static void main(String[] args) {
        Resource res = new ClassPathResource("projectBean.xml");
        /*
        BeanFactory will lazy init beans i.e. at line 16, it will create beans (line 15 of projectBean.xml will be called)
        But ApplicationContext creates only those beans in advance (early init) which other beans are dependent upon
        */
        ClassPathXmlApplicationContext bucket = new ClassPathXmlApplicationContext("projectBean.xml"); // It will call the Default Constructor only
        Student student = (Student) bucket.getBean("student"); // looks for the id in projectBean.xml
        System.out.println(student.getName());
        bucket.close();
    }
}
