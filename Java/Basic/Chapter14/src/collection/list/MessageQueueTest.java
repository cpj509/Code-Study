package collection.list;

import java.util.LinkedList;
import java.util.Queue;

class Message{
    String command;
    String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Send message to " + to;
    }
}

public class MessageQueueTest {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();
        //Queue 인터페이슬 구현한 대표적인 클래스가 LinkedList

        Message mail = new Message("sendMail", "K");
        Message sms = new Message("sendSMS", "J");
        Message katalk = new Message("sendKatalk", "C");

        messageQueue.offer(mail);
        messageQueue.offer(sms);
        messageQueue.offer(katalk);


        System.out.println(messageQueue.size());

        while(!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            System.out.println(message);
            /*switch (message.command){
                case "sendMail":
                    System.out.println("Send mail to " + message.to);
                    break;
                case "sendSMS":
                    System.out.println("Send SMS to " + message.to);
                    break;
                case "sendKatalk":
                    System.out.println("Send Katalk to " + message.to);
                    break;
                default:
                    System.out.println(message.command + "is not valid command.");
            }*/
        }

    }
}
