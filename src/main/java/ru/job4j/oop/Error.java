package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active + " " + "Error status " + status + " " + message);

    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error errorOne = new Error(false, 403, "Forbidden");
        errorOne.printInfo();
        Error errorTwo = new Error(false, 404, "Not Found");
        errorTwo.printInfo();
        Error errorThree = new Error(false, 504, "Gateway Timeout");
        errorThree.printInfo();
    }

}
