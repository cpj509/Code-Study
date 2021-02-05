//출처 programmers 전화번호 목록(hash)
package phonebook;

public class Solution {
    public boolean solution(String[] phone_book) {
        for (int i = 0; i < phone_book.length - 1; i++) {

            int len = phone_book[i].length();

            for (int j = i + 1; j < phone_book.length; j++) {
                if(phone_book[j].length() >= len
                        && phone_book[i].hashCode() == phone_book[j].substring(0, len).hashCode())
                    return false;
                else if (phone_book[j].length() < len
                        && phone_book[i].substring(0, phone_book[j].length()).hashCode() == phone_book[j].hashCode())
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        Solution a = new Solution();
        System.out.println(a.solution(phone_book));
    }
}