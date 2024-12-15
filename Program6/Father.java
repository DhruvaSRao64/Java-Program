class Father {
    protected int age;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Age cannot be negative for Father.");
        }
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
