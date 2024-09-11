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

        firstLanguage.getInfo();
    }

}
