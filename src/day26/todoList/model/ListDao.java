package day26.todoList.model;

import java.io.*;
import java.util.ArrayList;

public class ListDao {
    private static ListDao listDao = new ListDao();
    private ListDao () {
        fileLoad();
    }
    public static ListDao getInstance() {
        return listDao;
    }

    ArrayList<ListDto> listDB = new ArrayList<>();

    public boolean listWrite(ListDto listDto){
        listDB.add(listDto);
        fileSave();
        return true;
    }

    public ArrayList<ListDto> listPrint(){
        return listDB;
    }

    public void fileSave() {
        String outStr = "";

        for(int i = 0; i < listDB.size(); i++) {
            ListDto listDto = listDB.get(i);
            outStr += listDto.getContent() + "," + listDto.getDeadLine() + "," + listDto.isFinished() + "\n";
        }
        try {
            FileOutputStream outputStream = new FileOutputStream("./src/day26/todoList/data.txt");
            outputStream.write(outStr.getBytes());
            System.out.println("[파일 저장 성공]");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void fileLoad() {
        try {
            FileInputStream inputStream = new FileInputStream("./src/day26/todoList/data.txt");
            File file = new File("./src/day26/todoList/data.txt");
            byte[] bytes = new byte[(int) file.length()];
            inputStream.read(bytes);
            String inStr = new String(bytes);

            String[] field = inStr.split("\n");

            for(int i=0; i<= field.length-1; i++){
                String[] str=field[i].split(",");
                ListDto list=new ListDto(str[0],str[1]);
                listDB.add(list);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
