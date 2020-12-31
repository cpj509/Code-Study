package generic.product;

public class Product <T, M>{
    private T kind;     //타입의 종류
    private M model;    //타입의 모델

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
