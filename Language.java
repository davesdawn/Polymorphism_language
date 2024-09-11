public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    //this is a constructor with all the fields
    public Language (String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    //this is a method to display all the info
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people  mainly in " + this.regionsSpoken + ". " +
                "The language follows the word order: " + this.wordOrder);
    }

    public static void main(String[] args) {
        Language firstLanguage = new Language("GA", 5000, "Accra", "subject-verb-object");
        Mayan firstMayan = new Mayan("Chontal", 60523);
        SinoTibetan firstST = new SinoTibetan("Mandarin Chinese", 50000);
        SinoTibetan secondST = new SinoTibetan("Burmese", 40000);
        firstLanguage.getInfo();
        firstMayan.getInfo();
        firstST.getInfo();
        secondST.getInfo();
    }

}
