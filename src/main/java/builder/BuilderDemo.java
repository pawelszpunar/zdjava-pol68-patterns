package builder;

import java.time.LocalDate;

public class BuilderDemo {
    public static void main(String[] args) {

        User user = User.builder().login("ADAM").email("adam@sda.pl").build();

        //TAK NIE KORZYSTAMY Z BUILDERA
        User.Builder builder = User.builder().login("EWA");
        builder.email("ewa@sda.pl");
        User ewa = builder.build();
        builder.birthDate(LocalDate.now());
        User karol = builder.build();

        System.out.println(user);
        System.out.println(ewa);
        System.out.println(karol);

        user = User.builder().login("TEST").birthDate(LocalDate.now()).email("sda@sda.pl").build();
        System.out.println(user);

        Car porsche = Car.builder().brand("Porsche").model("911").power(240).build();
        System.out.println(porsche);
    }
}
