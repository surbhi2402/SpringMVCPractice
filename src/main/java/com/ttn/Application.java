package com.ttn;

import com.ttn.exercise3.Database;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {


        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Database database = (Database) context.getBean("database");
        database.connect();
        System.out.println("DB variables -> Port: "+ database.getPort() + " Name: "+ database.getName());


//        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("myCustomEventPublisher");
//        customEventPublisher.publish();
//        customEventPublisher.publish();


//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        /* Q1:
        Database database = (Database) context.getBean("database");
        database.test();*/

//         Q2 n 3
        /*Restaurant teaRestaurant = (Restaurant) context.getBean("restaurant");
        teaRestaurant.printTeaDetails();*/

        /*Restaurant expressTeaRestaurant = (Restaurant) context.getBean("expressTeaRestaurant");
        expressTeaRestaurant.printTeaDetails();*/

        /*Complex complex = (Complex) context.getBean("complexBean");
        complex.printListElements();
        complex.printSetElements();
        complex.printMapElements();*/

        /*Restaurant teaRestaurant = (Restaurant) context.getBean("expressTeaRestaurant");
        System.out.println(teaRestaurant);

        Restaurant teaRestaurant2 = (Restaurant) context.getBean("expressTeaRestaurant");
        System.out.println(teaRestaurant2);*/




        /*RestaurantRepository repository = (RestaurantRepository) context.getBean("restaurantRepository");
        Tea tea1 = new Tea();
        Restaurant restaurant1 = new Restaurant();
        restaurant1.setTea(tea1);
        repository.add(restaurant1);

        System.out.println("Restaurant tea type >> "+ restaurant1.getTea().type);
        Restaurant teaRestaurant = (Restaurant) context.getBean("restaurant");
        teaRestaurant.printTeaDetails();*/
    }
}
