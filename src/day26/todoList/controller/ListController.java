package day26.todoList.controller;

import day26.todoList.model.ListDao;
import day26.todoList.model.ListDto;

import java.util.ArrayList;

public class ListController {

    private static ListController listController = new ListController();
    private ListController () {}
    public static ListController getInstance(){
        return listController;
    }

    public boolean listWrite(String content, String deadLine) {
        ListDto listDto = new ListDto(content, deadLine);
        return ListDao.getInstance().listWrite(listDto);
    }

    public ArrayList<ListDto> listPrint() {
        ArrayList<ListDto> result = ListDao.getInstance().listPrint();
        return result;
    }
}
