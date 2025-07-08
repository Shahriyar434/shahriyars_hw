package mygame.heroes;

public class Register {
    private String username;
    private String password;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void login(String inputPassword) {
        if (this.password.equals(inputPassword)) {
            System.out.println("Welcome, " + name + ")");
        } else {
            System.out.println("Incorrect password. Do you want to reset your password?");
        }
    }

    // Optional: password reset method
    public void resetPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Your password has been reset.");
    }
}
