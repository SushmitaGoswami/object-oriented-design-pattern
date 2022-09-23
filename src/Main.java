import org.sushmita.design_patterns_oops.bridge.*;
import org.sushmita.design_patterns_oops.composite.Project;
import org.sushmita.design_patterns_oops.composite.ToDo;
import org.sushmita.design_patterns_oops.iterator.*;
import org.sushmita.design_patterns_oops.proxy.protection.ConcreteObject;
import org.sushmita.design_patterns_oops.proxy.protection.ProxyObject;
import org.sushmita.design_patterns_oops.state.CloseGateState;
import org.sushmita.design_patterns_oops.state.Gate;
import org.sushmita.design_patterns_oops.template.User;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Observable observable = new Observable();
//        Observer observer1 = new Observer();
//        Observer observer2 = new Observer();
//        Observer observer3 = new Observer();
//        Observer observer4 = new Observer();
//
//        observable.subscribe(observer1);
//        observable.subscribe(observer2);
//        observable.subscribe(observer3);
//        observable.subscribe(observer4);
//        observable.update();

//        Beverage beverage1 = new MilkBeverageDecorator(new IceBeverageDecorator(new Coffee()));
//        Beverage beverage2 = new MilkBeverageDecorator(new IceBeverageDecorator(new MilkBeverageDecorator(new Tea())));
//        System.out.println(beverage2.cost());
//        System.out.println(beverage1.cost());

//        Notification smsNotification = NotificationFactory.getNotification(Notification.NotificationType.SMS);
//        Notification emailNotification = NotificationFactory.getNotification(Notification.NotificationType.EMAIL);
//        smsNotification.send("Hello there!");
//        emailNotification.send("Hello there!");

//        UIFactory windowsFactory = AbstractUIFactory.createUIFactory(AbstractUIFactory.UIType.WINDOWS);
//        UIFactory linuxFactory = AbstractUIFactory.createUIFactory(AbstractUIFactory.UIType.LINUX);
//        windowsFactory.createButton().render();
//        windowsFactory.createTerminal().render();
//        linuxFactory.createTerminal().render();
//        linuxFactory.createButton().render();

//        Light light = new Light();
//        LightOnCommand lightOnCommand = new LightOnCommand(light);
//        LightOffCommand lightOffCommand = new LightOffCommand(light);
//        LightDimUpCommand lightDimUpCommand = new LightDimUpCommand(light);
//        LightDimDownCommand lightDimDownCommand = new LightDimDownCommand(light);
//
//        Remote remote = new Remote(lightOnCommand, lightOffCommand, lightDimUpCommand, lightDimDownCommand);
//
//        remote.lightOn();
//        remote.lightDimUp();
//        remote.lightDimDown();
//        remote.lightOff();

//        Adapter adapter = new Adapter(new AdapteeImpl());
//        adapter.request();

//        LazyBookParser bookParser = new LazyBookParser("hello world!");
//        System.out.println(bookParser.getNumberOfPages());
//        System.out.println(bookParser.getNumberOfWords());

//        ProxyObject proxyObject = new ProxyObject(new ConcreteObject());
//        proxyObject.sendMessage("Hello there!");

//        LongFormView longFormActorView = new LongFormView(new ActorResource(new Actor("Sharukh", "Khan", "Indian Actor")));
//        ShortFormView shortFormBookView = new ShortFormView(new BookResource(new Book("The Alchemist", "Mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure", "Whole BOOK")));
//        longFormActorView.title();
//        longFormActorView.description();
//
//        shortFormBookView.title();
//        shortFormBookView.description();

//          User user = new User();
//          org.sushmita.design_patterns_oops.template.Book book = new org.sushmita.design_patterns_oops.template.Book();
//          user.save();
//          book.save();

//           ToDo toDo1 = new ToDo("A");
//           ToDo toDo2 = new ToDo("B");
//           ToDo toDo3 = new ToDo("C");
//
//           Project project = new Project(Arrays.asList(toDo1, toDo2, toDo3));
//           System.out.println(project.text());
//
//             ListInventory listInventory = new ListInventory(Arrays.asList("A", "B", "C"));
//             HandInventory handInventory = new HandInventory("A","B");
//             Iterator listIterator = (ListIterator) listInventory.getIterator();
//             Iterator handIterator = (HandIterator) handInventory.getIterator();
//
//             System.out.println("Content of List");
//             while(listIterator.hasNext()){
//                 System.out.println(listIterator.next() + ", ");
//             }
//
//             System.out.println("Content of Hand");
//             while(handIterator.hasNext()){
//                 System.out.println(handIterator.next()+ ", ");
//             }

//               Gate gate = new Gate();
//               gate.enter();
//               gate.pay();
//               gate.enter();
//               gate.enter();
//               gate.pay();
//               gate.pay();
//               gate.enter();

    }
}
