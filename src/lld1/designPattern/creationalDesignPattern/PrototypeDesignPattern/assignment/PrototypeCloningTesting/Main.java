package designPattern.creationalDesignPattern.PrototypeDesignPattern.assignment.PrototypeCloningTesting;

public class Main {
    public static void main(String[] args) {
        User newUser = new User(1, "Ashish", "a@gmail.com", "Aks", 28, UserType.ADMIN);
        User copyUser = newUser.cloneObject();
        copyUser.setUsername("Khaleesi");
        System.out.println(copyUser.toString());
        System.out.println(newUser);

        UserRegistry userRegistry = new UserRegistry();
        userRegistry.addPrototype(new User(UserType.ADMIN));
        userRegistry.addPrototype(new User(UserType.READER));
        userRegistry.addPrototype(new User(UserType.WRITER));

        User tempUser = userRegistry.getPrototype(UserType.ADMIN).cloneObject();
        tempUser.setUsername("Temp");
        tempUser.setAge(26);
        tempUser.setUserId(7);
        tempUser.setEmail("temp@email.com");
        tempUser.setDisplayName("Temperory");

        System.out.println(tempUser.toString());
    }
}
