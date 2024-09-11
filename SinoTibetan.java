public class SinoTibetan extends Language {

    public SinoTibetan(String languageName, int speakers){
        super(languageName, speakers, "Asia", "verb-object-subject");
        if (languageName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}
