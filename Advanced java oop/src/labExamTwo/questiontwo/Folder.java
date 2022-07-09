package labExamTwo.questiontwo;

import java.util.ArrayList;

public class Folder {
  File file;
    String name;
    ArrayList<File> fileType = new ArrayList<>();

    public void addFolder(File f){
        fileType.add(f);
    }

    Folder(String name){
        this.name = name;
    }

    public void rename(String name){
        this.name = name;
    }


    public void addFile(File sortalgo) {
       this.file.strlist.add(String.valueOf(sortalgo));
    }

}
