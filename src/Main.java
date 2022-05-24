import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // 1 Задание
        String FirstName = "Ivan";
        String middleName = "Ivanovich";
        String lastNeme = "Ivanov";

        System.out.println("ФИО сотрудника - "+ lastNeme+ "," + FirstName+ "," + middleName+".");

        // 2 Задание
        String fullname = "Ivaniv ivan ivanivich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+ fullname.toUpperCase());

        // 3 Задание
        fullname = "Ивынов Семён Семёнович";
       System.out.println("Данные ФИО сотрудника -" +fullname.replace( "ё", "e"));
        String[] names = fullname.split( "");
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (name.contains("ё")) {
                int index = name.indexOf("ё");
                names[i] = name.substring(0, index) + "e"+ name.substring(index+1)  ;

            }
            if (i== name.length()-1) {
                System.out.print(names[i]);
            } else
            {
                System.out.print(names[i]+"");
            }
        }
    }
}