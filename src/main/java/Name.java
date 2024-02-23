public class Name {

    private String name;

    public Name(String name) {
        if(name.isEmpty()) throw new IllegalArgumentException("메세지가 공백상태입니다.");
        if(name.length() > 5) throw new IllegalArgumentException("차 이름은 5자를 초과할 수 없습니다.");
        this.name = name;
    }
}
