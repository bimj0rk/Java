class CardTest{
    public static void main(String[] args){
        Card card1 = new Holiday("John");
        card1.greeting();

        System.out.println();

        Card card2 = new Birthday("Betty", 18);
        card2.greeting();
    }
}
