package infinity.zone.convertors;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;
import infinity.zone.etaconvert.R;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CustomCalcDialog extends Dialog implements OnClickListener {

	private String name;
	private String lastValue;
	public Animation animAlpha;

	EditText screen;
	TextView txtView;
	Button button0, button1, button2, button3, button4, button5, button6,
			button7, button8, button9, buttonPlus, buttonMinus, buttonMultiply,
			buttonDivide, buttonminplus, buttonEqual, buttonPoint, buttonDel,
			buttonReset, buttonBra, button_del;

	public CustomCalcDialog(Context context, String name) {
		super(context);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	boolean minPlus = true;
	boolean clear_screen = true;
	boolean operator_state = false;
	boolean insert_state = false;
	boolean last_click = false;
	Double Operand1 = 0.0;
	Double Operand2 = 0.0;
	Double Answer = 0.0;
	String Operator = "";
	Double doubleEditTextMsg, toRadian_doubleEditTextMsg;
	// ----------

	OnMyDialogResult mDialogResult; // the callback

	// ----------

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cal_view);

		intialiseVar();
		onClickListeners();
		// mDialogResult.finish(String.valueOf(edt.getText())); -- in equals
		// filed
		animAlpha  = AnimationUtils.loadAnimation(getContext(), R.anim.anim_alpha);
	}

	public void setDialogResult(OnMyDialogResult dialogResult) {
		mDialogResult = dialogResult;
	}

	public interface OnMyDialogResult {
		void finish(String result);
	}

	public void onClickListeners() {
		button0.setOnClickListener(this);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
		button6.setOnClickListener(this);
		button7.setOnClickListener(this);
		button8.setOnClickListener(this);
		button9.setOnClickListener(this);

		buttonPlus.setOnClickListener(this);
		buttonMinus.setOnClickListener(this);
		buttonMultiply.setOnClickListener(this);
		buttonDivide.setOnClickListener(this);
		buttonPoint.setOnClickListener(this);
		buttonEqual.setOnClickListener(this);
		buttonminplus.setOnClickListener(this);

		buttonReset.setOnClickListener(this);
		button_del.setOnClickListener(this);


	}

	@SuppressLint("CutPasteId")
	public void intialiseVar() {
		txtView = (TextView) findViewById(R.id.textView);
		screen = (EditText) findViewById(R.id.screen);
		button0 = (Button) findViewById(R.id.button0);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);

		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);

		buttonPlus = (Button) findViewById(R.id.buttonAdd);
		buttonMinus = (Button) findViewById(R.id.buttonSub);
		buttonMultiply = (Button) findViewById(R.id.buttonMulti);
		buttonDivide = (Button) findViewById(R.id.buttonDiv);
		buttonPoint = (Button) findViewById(R.id.buttonPoint);

		buttonEqual = (Button) findViewById(R.id.buttonExe);
		buttonReset = (Button) findViewById(R.id.buttonClear);

		button_del = (Button) findViewById(R.id.buttonDel);
		buttonminplus = (Button) findViewById(R.id.buttonminplus);


	}

	public void insert_text(String text) {
		if (this.clear_screen) {
			txtView.setText("");

			this.clear_screen = false;
		}
		this.insert_state = true;
		this.last_click = true;
		screen.append(text);

		enableButton();
		calculator();

	}

	public void set_operator(String operator) {

		if (operator.equals("+")) {
			screen.append("+");
			disableButton();
		} else if (operator.equals("-")) {
			screen.append("-");
			disableButton();

		} else if (operator.equals("*")) {
			screen.append("*");
			disableButton();

		} else if (operator.equals("/")) {
			screen.append("/");
			disableButton();

		}

	}

	public void calculator() {
		String result = conAfterDel(screen.getText().toString());
		txtView.setText(result);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button0:
			insert_text("0");
			break;
		case R.id.button1:
			insert_text("1");
			break;
		case R.id.button2:
			insert_text("2");
			break;

		case R.id.button3:
			insert_text("3");

			break;
		case R.id.button4:
			insert_text("4");

			break;
		case R.id.button5:
			insert_text("5");

			break;
		case R.id.button6:
			insert_text("6");

			break;
		case R.id.button7:
			insert_text("7");

			break;
		case R.id.button8:
			insert_text("8");

			break;
		case R.id.button9:
			insert_text("9");

			break;

		case R.id.buttonPoint:

			// insert_text(".");
			insertZero();
			break;
		case R.id.buttonAdd:
			set_operator("+");
			break;
		case R.id.buttonSub:
			set_operator("-");
			break;
		case R.id.buttonMulti:
			set_operator("*");
			break;
		case R.id.buttonDiv:
			set_operator("/");
			break;
		// ----****
		case R.id.buttonminplus:
			insertMinPlus();
			break;

		case R.id.buttonExe:
			if (screen.getText().toString().length() > 0) {
				this.clear_screen = true;
				this.Operand1 = 0.0;
				this.Operand2 = 0.0;
				this.Operator = "";
				this.operator_state = false;
				mDialogResult.finish(String.valueOf(conAfterDel(screen
						.getText().toString())));

			}
			break;

		case R.id.buttonDel:

			if (screen.getText().toString().length() > 1) {
				lastValue = screen.getText().toString();
				String txt_new = screen.getText().toString()
						.substring(0, screen.getText().toString().length() - 1);
				screen.setText(txt_new);
				txtView.setText(conAfterDel(txt_new));

				if (Double.valueOf(txtView.getText().toString()) == 0.0) {
					disableButton();
				} else {
					enableButton();
				}

				this.clear_screen = false;

			} else {

				txtView.setText("");
				screen.setText("");
			}
			break;
		case R.id.buttonClear:
			this.Operand1 = 0.0;
			this.Operand2 = 0.0;
			this.Answer = 0.0;
			this.Operator = "";
			this.operator_state = false;
			this.insert_state = false;
			this.last_click = false;
			this.clear_screen = true;
			txtView.setText("0");
			screen.setText("");
			break;

		}
		   v.startAnimation(animAlpha);

	}

	public String conAfterDel(String arg) {
		Calculable calc = null;
		double result = 0.0;
		try {
			calc = new ExpressionBuilder(arg).build();

			result = calc.calculate();
			// result = Math.floor(result * 1000) / 1000;

		} catch (Exception e) {

		}

		return String.valueOf(result);

	}

	public void insertZero() {
		if (screen.getText().toString().length() >= 1) {
			String txt_new = screen.getText().toString()
					.substring(screen.getText().toString().length() - 1);
			// Toast.makeText(getContext(), txt_new, Toast.LENGTH_LONG).show();

			if (txt_new.equalsIgnoreCase("+") || txt_new.equalsIgnoreCase("-")
					|| txt_new.equalsIgnoreCase("*")
					|| txt_new.equalsIgnoreCase("/")) {
				insert_text("0" + ".");

			} else if (Double.valueOf(txt_new) >= 1) {
				insert_text(".");
			} else {
				insert_text("0" + ".");
			}
		} else {
			insert_text("0" + ".");
		}
	}

	public void insertMinPlus() {
		if (screen.getText().toString().length() > 1) {
			String txt_new = screen.getText().toString();
			screen.setText("");
			if (minPlus) {
				screen.append("-" + txt_new);
				minPlus = false;
				calculator();
			} else {
				screen.setText(txt_new.substring(1));
				minPlus = true;
				calculator();
			}
		}
	}

	public void disableButton() {
		buttonEqual.setBackgroundDrawable(getContext().getResources()
				.getDrawable(R.drawable.cal_button));
		buttonEqual.setEnabled(false);

	}

	public void enableButton() {
		buttonEqual.setBackgroundDrawable(getContext().getResources()
				.getDrawable(R.drawable.cal_button_art));
		buttonEqual.setEnabled(true);

	}

}
