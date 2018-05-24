package jeremia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller
{
	private String digit = "";
	private double temp = 0;
	private String currentOpt = "";
	@FXML private Button one;
	@FXML private Button two;
	@FXML private Button three;
	@FXML private Button four;
	@FXML private Button five;
	@FXML private Button six;
	@FXML private Button seven;
	@FXML private Button eight;
	@FXML private Button nine;
	@FXML private Button zero;
	@FXML private Button point;
	@FXML private Button doubleZero;
	@FXML private Button plus;
	@FXML private Button minus;
	@FXML private Button equal;
	@FXML private TextField textField;


	public void numberClicked(ActionEvent e)
	{
		if (e.getSource().equals(one))
			digit += "1";
		else if (e.getSource().equals(two))
			digit += "2";
		else if (e.getSource().equals(three))
			digit += "3";
		else if (e.getSource().equals(four))
			digit += "4";
		else if (e.getSource().equals(five))
			digit += "5";
		else if (e.getSource().equals(six))
			digit += "6";
		else if (e.getSource().equals(seven))
			digit += "7";
		else if (e.getSource().equals(eight))
			digit += "8";
		else if (e.getSource().equals(nine))
			digit += "9";
		else if (e.getSource().equals(zero))
			digit += "0";
		else if (e.getSource().equals(doubleZero))
			digit += "00";
		else if (e.getSource().equals(point))
			digit += ".";
		else if (e.getSource().equals(plus))
		{
			currentOpt = "+";
			temp -= Double.parseDouble(digit);
			digit = "";
		}
		else if (e.getSource().equals(minus))
		{
			currentOpt = "-";
			temp += Double.parseDouble(digit);
			digit = "";
		}
		else if (e.getSource().equals(equal))
		{
			if (currentOpt.equals("+"))
				temp += Double.parseDouble(digit);
			else if (currentOpt.equals("-"))
				temp -= Double.parseDouble(digit);
			digit = String.valueOf(temp);
			currentOpt = "";
		}
		System.out.println(temp);
		textField.setText(digit);
	}

	public void clear()
	{
		temp = 0;
		digit = "";
		textField.setText(digit);
	}
}
