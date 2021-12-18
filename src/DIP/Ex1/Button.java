package DIP.Ex1;

public class Button
{
    private ButtonServer _buttonServer;
    private boolean _state;

    public Button(ButtonServer _buttonServer)
    {
    	this._buttonServer = _buttonServer;
    }

    public void toggle()
    {
        _state = !_state;
        boolean buttonOn = _state;
        if (buttonOn) {
        	_buttonServer.turnOn();
        } else {
        	_buttonServer.turnOff();
        }
    }

}