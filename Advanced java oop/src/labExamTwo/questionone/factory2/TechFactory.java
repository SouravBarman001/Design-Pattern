package labExamTwo.questionone.factory2;

public class TechFactory {
    public MakingProduct getBuilding(String building1) {
        if (building1 != null){
            if ("printer".equalsIgnoreCase(building1)){
                return new Printer();
            }
            if ("keyboard".equalsIgnoreCase(building1)){
                return new Keyboard();
            }
            if ("mouse".equalsIgnoreCase(building1)){
                return new Mouse();
            }
        }
        return null;
    }
}
