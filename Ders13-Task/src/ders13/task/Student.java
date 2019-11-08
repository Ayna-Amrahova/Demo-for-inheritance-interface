package ders13.task;

public class Student extends Person implements Excellent {

    private double currentScore;

    public double getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(double currentScore) {
        this.currentScore = currentScore;
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double increaseScore(double score) {
        currentScore += score;
        return currentScore;
    }

    @Override
    public boolean isContinuity() {
        return true;
    }

}
