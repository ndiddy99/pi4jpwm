import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinPwmOutput;
import com.pi4j.io.gpio.RaspiPin;

public class PWM {
	final GpioController gpio = GpioFactory.getInstance();
	final GpioPinPwmOutput pwm = gpio.provisionPwmOutputPin(RaspiPin.GPIO_01, "HwPwm"); // gpio 1=pin 12

	public void setPwm(int value) {
		pwm.setPwm(value);
	}
	
	public int getPwm() {
		return pwm.getPwm();
	}
}
