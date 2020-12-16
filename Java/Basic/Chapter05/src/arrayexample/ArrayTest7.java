package arrayexample;

public class ArrayTest7 {
    public static void main(String[] args) {
        String[] comLang = new String[4];
        comLang[0] = "Java";
        comLang[1] = "C++";
        comLang[2] = "Python";
        comLang[3] = "JavaScript";

        for (int i = 0; i < comLang.length; i++) {
            System.out.println(comLang[i]);

        }
        for (String lang :
                comLang) {
            System.out.println(lang);

        }
    }
}
