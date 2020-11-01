public class TurkeyAdapter implements Duck{
    private Turkey turkey;

    TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
for(int i = 0; i < 5;i++){
    turkey.fly();
}
    }
}
