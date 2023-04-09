package ir.preacher;


import ir.preacher.mapper.customMapper.CustomMapper;
import ir.preacher.mapper.dozerMapper.DozerMapperImp;
import ir.preacher.mapper.mapStruct.Mapstruct;
import ir.preacher.mapper.modelMapper.ModelMapperImp;
import ir.preacher.model.User;

public class App {
    private final DozerMapperImp dozerMapper;
    private final ModelMapperImp modelMapper;
    private final CustomMapper customMapper;

    public App() {
        dozerMapper = new DozerMapperImp();
        modelMapper = new ModelMapperImp();
        customMapper = new CustomMapper();
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run(){
        User user = new User(
                "Naser",
                "Raoof",
                28,
                "NaserRaoof",
                "HachHalHaft");

        int forTimes = 15000000;
        long startTime;
        long finishTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < forTimes; i++) {
            dozerMapper.userToUserDTO(user);
        }
        finishTime = System.currentTimeMillis();
        long dozerTime = finishTime - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < forTimes; i++) {
            modelMapper.userToUserDTO(user);
        }
        finishTime = System.currentTimeMillis();
        long ModelTime = finishTime - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < forTimes; i++) {
            Mapstruct.INSTANCE.userToUserDTO(user);
        }
        finishTime = System.currentTimeMillis();
        long MapStructTime = finishTime - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < forTimes; i++) {
            customMapper.userToUserDTO(user);
        }
        finishTime = System.currentTimeMillis();
        long CustomMapperTime = finishTime - startTime;

//        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Dozer Mapper --> In " + dozerTime/1000 + "." + dozerTime%1000 + " second(s)!");
        System.out.println("Model Mapper --> In " + ModelTime/1000 + "." + ModelTime%1000 + " second(s)!");
        System.out.println("MapStruct --> In " + MapStructTime/1000 + "." + MapStructTime%1000 + " second(s)!");
        System.out.println("Custom Mapper --> In " + CustomMapperTime/1000 + "." + CustomMapperTime%1000 + " second(s)!");
    }


}
