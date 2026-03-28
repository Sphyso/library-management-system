package org.library;

abstract class User {
    private String userId;
    private String name;
    private String email;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void displayProfile() {
        System.out.println("User id is: "+ this.userId +"\n"+
                            "User name is: "+ this.name +"\n"+
                            "User email is: "+ this.email);
    }
}