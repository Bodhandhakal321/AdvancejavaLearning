//package Events;
//
//public class Controller  extends  Model{
//    public  int increment(){
//    return num+1;
//    }
//}
//
package Events;

public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public int increment() {
        int num = model.get() + 1;
        model.set(num);
        return num;
    }
    public int decrement() {
        int num = model.get() - 1;
        model.set(num);
        return num;
    }
}

