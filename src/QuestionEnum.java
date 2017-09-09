public enum QuestionEnum {


    YES(true), TAK(true), tak(true),
    yes(true), yup(true), YUP(true),
    si(true), SI(true), dobrze(true),
    NO(false), NIE(false), no(false),
    nie(false), nein(false), nope(false),
    źle(false), zle(false),
    ZLE(false);


    QuestionEnum(boolean isCorrect)

    {
        this.isCorrect = isCorrect;
    }

    private boolean isCorrect;

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public static void main(String[] args) {
        System.out.println(QuestionEnum.valueOf("YES").isCorrect());
        System.out.println(QuestionEnum.valueOf("źle").isCorrect());
    }

}

