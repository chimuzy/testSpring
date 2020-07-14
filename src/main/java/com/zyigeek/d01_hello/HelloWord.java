package com.zyigeek.d01_hello;

public class HelloWord {

    private String username;

    public HelloWord(){
        System.out.println("HelloWord()");
    }
    public HelloWord(String username) {
        this.username = username;
        System.out.println("HelloWord(String username)");
    }

    public void setUsername(String username) {
        this.username = username;
        System.out.println("setUsername(String username)");
    }
    public String getUsername() {
        System.out.println("getUsername()");
        return username;

    }

    @Override
    public String toString() {
        return "HelloWord{" +
                "username='" + username + '\'' +
                '}';
    }

    public void work(){
        System.out.println(this.username+"正在工作");
    }
}
