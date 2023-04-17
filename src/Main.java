import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Eevee> eevees =new ArrayList<>();
        eevees.add(new Eevee("シャワーズ",130,65,60,110,95,65));
        eevees.add(new Eevee("サンダース",65,65,60,110,95,130));
        eevees.add(new Eevee("ブースター",65,130,60,95,110,65));

        eevees.stream()
                .filter(eevee -> eevee.getHitpoint() > 100)
                .forEach(eevee -> System.out.println("たいりょくが１００以上は"+eevee.getName()+"です"));

        eevees.stream()
                .filter(eevee -> eevee.getContact() > 100)
                .forEach(eevee -> System.out.println("とくこうが１００以上は"+eevee.getName()+"です"));
    }
}