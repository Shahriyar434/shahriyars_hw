package mygame.heroes.Login;

import mygame.heroes.Register;

public class Login {
    public static void main(String[] args) {
        Register newUser = new Register();

        newUser.setUsername("myUser");
        newUser.setPassword("55555");
        newUser.setName("Shahriyar");
        newUser.setSurname("Rahimli");
        newUser.setPhoneNumber("+9942224242");
        newUser.setEmail("aliexpress@example.com");

        System.out.println("User registered ");
        System.out.println("Username: " + newUser.getUsername());
        System.out.println("Email: " + newUser.getEmail());
        System.out.println("password" + newUser.getPassword());

    }
}