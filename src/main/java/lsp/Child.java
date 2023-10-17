package ua.com.fok.solid.lsp;

public class Child extends Parent {
    @Override
    public void doSmth(){
        throw new RuntimeException();
    }
}
