package mygame.heroes;

import java.io.File;

class Instuctor {
    public static void main(String[] args) {

        File mylife = new File("C:\\Users\\asus\\Desktop\\My life");


        File myday = new File(mylife, "My day");


        System.out.println("Is 'My life' a directory? " + mylife.isDirectory());
        System.out.println("Is 'My day' a directory? " + myday.isDirectory());


        System.out.println("Absolute path (My life): " + mylife.getAbsolutePath());
        System.out.println("Absolute path (My day): " + myday.getAbsolutePath());


        System.out.println("'My life' exists: " + mylife.exists());
        System.out.println("'My day' exists: " + myday.exists());


        if (!mylife.exists()) {

            System.out.println("'My life' folder created.");
        }
        if (!myday.exists()) {

            System.out.println("'My day' folder created.");
        }


        System.out.println("Delete 'My day': " + myday.delete());


        System.out.println("'My day' exists after delete: " + myday.exists());
    }
}
