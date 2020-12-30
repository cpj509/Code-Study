package bookshelf;

import java.util.ArrayList;

public class Shelf {//ArrayList
    protected ArrayList<String> shelf;
    
    //생성자에서 ArrayList 생성.(생성자)
    public Shelf(){
        shelf = new ArrayList<>();
    }

    //요소의 개수를 세는 메서드
    public int getCount(){
        return shelf.size();
    }
}
