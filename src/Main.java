import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(conditionsForActivation(25,  -21));
        System.out.println(conditionsForActivation(24,  10));
        System.out.println(conditionsForActivation( 41,  -32));
        System.out.println(conditionsForActivation(  35,  -5));
        System.out.println(conditionsForActivation(15,  22));
        System.out.println(conditionsForActivation(generateRandomAge(),-1));
        System.out.println(conditionsForActivation(generateRandomAge(),-25));
    }

public static String conditionsForActivation(int age, int temperature) {
        if ((age>=20 &&temperature>=-20 && temperature<=30 )
            ||(age<20&&temperature>=0&&temperature<=28)
            ||(age<45&&temperature>=-10&&temperature<=25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
        }
    public class test{
        public static void main(String[] args) {
            System.out.println(conditionsForActivation( 23, 10));
            System.out.println(conditionsForActivation(generateRandomAge(),  10));

        }
        }

    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(45)+1;
    }
    }


