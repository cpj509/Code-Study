package bookshelf;

public interface Queue {
    public void enQueue(String title);//책을 추가(입력)
    public String deQueue();//책을 꺼내기(삭제)
    public int getSize();//요소의 개수
}
