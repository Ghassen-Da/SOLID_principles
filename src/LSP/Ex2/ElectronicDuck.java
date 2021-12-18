package LSP.Ex2;

public class ElectronicDuck implements IDuck
{
    private boolean _on = false;

    @Override
    public void quack() throws Exception
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new Exception("Can't quack when off");
        }
    }

    @Override
    public void swim() throws Exception
    {
        if (_on) {
            System.out.println("Electronic duck swim...");
        } else {
            throw new Exception("Cant swim when off");
        }
    }

    public void turnOn()
    {
        this._on = true;
    }

    public void turnOff()
    {
        this._on = false;
    }

}
