package infinity.zone.etaconvert;

import infinity.zone.convertors.CustomCalcDialog;
import infinity.zone.convertors.CustomCalcDialog.OnMyDialogResult;
import infinity.zone.convertors.Datasize;

import java.text.DecimalFormat;
import java.util.ArrayList;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class Frag_Datasize extends Fragment {
	private DecimalFormat df;

	String[] main_arr;
	String[] arr;
	ArrayAdapter<String> arrAdapt;
	ArrayList<String> lv_arr;

	ListView myList;
	EditText filterText = null;
	EditText valueFrom;
	EditText valueTo;

	TextView choice_one;
	TextView choice_two;
	TextView oval_one;
	TextView oval_two;


	String droppedItemFrom;
	String droppedItemTo;
	String commentMsg;
	ImageButton swap;
	View v;
	LinearLayout wrapper;
	CustomCalcDialog dialog;


	SharedPreferences getProgramPrefs;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		wrapper = new LinearLayout(getActivity());
		setRetainInstance(true);// oh oh that's WTF my time
		v = inflater.inflate(R.layout.frag_units, wrapper, true);
		setHasOptionsMenu(true);
		 getProgramPrefs = PreferenceManager
					.getDefaultSharedPreferences(getActivity());
		
		
		choice_one = (TextView) wrapper.findViewById(R.id.choice_1);
		choice_two = (TextView) wrapper.findViewById(R.id.choice_2);
		oval_one = (TextView) wrapper.findViewById(R.id.ovalFrom);
		oval_two = (TextView) wrapper.findViewById(R.id.ovalTo);
		

		valueFrom = (EditText) wrapper.findViewById(R.id.textNumber);
		valueTo = (EditText) wrapper.findViewById(R.id.textNumberTo);
		filterText = (EditText) wrapper.findViewById(R.id.searchEditText);

		swap = (ImageButton) wrapper.findViewById(R.id.button_swap);
		myList = (ListView) wrapper.findViewById(R.id.AngelView);

		// array list & set Adaptor
		main_arr = getResources().getStringArray(R.array.DataSize_list);
		lv_arr = new ArrayList<String>(main_arr.length);
		for (String myArray : main_arr) {
			lv_arr.add(myArray);
		}
		arr = lv_arr.toArray(new String[lv_arr.size()]);
		arrAdapt = new ArrayAdapter<String>(getActivity(),
				R.layout.mylist, arr);
		myList.setAdapter(arrAdapt);
		arrAdapt.setNotifyOnChange(true);
		myList.setTextFilterEnabled(true);
		// ----------------------------------
		// ---------------------------------- setting default value
		// ----------------------------------
		droppedItemFrom = myList.getItemAtPosition(0).toString();
		droppedItemTo = myList.getItemAtPosition(1).toString();
		oval_one.setText(droppedItemFrom);
		oval_two.setText(droppedItemTo);
		myList.requestFocus();
		// ---------------------------------
		// start filter text
		filterText.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
			}

			@Override
			public void afterTextChanged(Editable arg0) {
				Frag_Datasize.this.arrAdapt.getFilter().filter(arg0);

			}
		});
		// -------------------------
		myList.setOnItemLongClickListener(new OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> l, View v,
					int position, long id) {
				arrAdapt.setNotifyOnChange(true);
				ClipData.Item item = new ClipData.Item(arrAdapt
						.getItem(position));
				String[] clipDescription = { ClipDescription.MIMETYPE_TEXT_PLAIN };
				ClipData dragData = new ClipData((CharSequence) v.getTag(),
						clipDescription, item);
				DragShadowBuilder myShadow = new MyDragShadowBuilder(v);

				v.startDrag(dragData, 
						myShadow, 
						arrAdapt.getItem(position), 
						0);

				return true;
			}
		});
		// ------- call operation to filter number and call to calcute
		valueFrom.setOnFocusChangeListener(new OnFocusChangeListener() {

			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// custom dialog
				 dialog = new CustomCalcDialog(v
						.getContext(), "");
				dialog.setDialogResult(new OnMyDialogResult() {
					public void finish(String result) {
						valueFrom.setText(formatToDot(result));
						dialog.dismiss();
						myCalculate(valueFrom.getText().toString(), "from");
						myList.requestFocus();

					}
				});
				dialog.getWindow();
				dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
				dialog.setContentView(R.layout.cal_view);
				if (hasFocus) {

					dialog.show();
				}
				dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
					@Override
					public void onCancel(DialogInterface dialog) {
						myList.requestFocus();
					}
				});

			}

		});

		// ---------------------------------------------------------------------------------------------
		// Like swap convert to -- > convert from
		// ---------------------------------------------------------------------------------------------
		valueTo.setOnFocusChangeListener(new OnFocusChangeListener() {

			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// custom dialog
				dialog = new CustomCalcDialog(v
						.getContext(), "");
				dialog.setDialogResult(new OnMyDialogResult() {
					public void finish(String result) {
						valueTo.setText(formatToDot(result));
						// Toast.makeText(getActivity().getApplicationContext(),userFormat(result),
						// Toast.LENGTH_LONG).show();
						dialog.dismiss();
						myCalculate(valueTo.getText().toString(), "To");
						
						myList.requestFocus();
					}
				});
				dialog.getWindow();
				dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
				dialog.setContentView(R.layout.cal_view);
				if (hasFocus) {

					dialog.show();
				}
				dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
					@Override
					public void onCancel(DialogInterface dialog) {
						myList.requestFocus();
					}
				});
			}

		});

		// -----------------------------------------------------------------------------------------
		// ------ set swiping
		swap.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String temp = droppedItemFrom;

				droppedItemFrom = droppedItemTo;
				droppedItemTo = temp;
				swapAnimation();
				oval_one.setText(droppedItemFrom);
				oval_two.setText(droppedItemTo);
			
				myCalculate(valueFrom.getText().toString(), "from");

			}
		});
		// ------------------------------------------------------------------------
		// set D&D to editText & TextView
		// ------------------------------------------------------------------------

		valueFrom.setOnDragListener(new View.OnDragListener() {
			@Override
			public boolean onDrag(View v, DragEvent event) {
				boolean result = true;
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:

					break;
				case DragEvent.ACTION_DRAG_LOCATION:

					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DROP:
					ClipData.Item item = event.getClipData().getItemAt(0);
					droppedItemFrom = item.getText().toString();
					myAnimationOvalOne();
					oval_one.setText(droppedItemFrom);
					myCalculate(valueFrom.getText().toString(), "from");
					break;
				case DragEvent.ACTION_DRAG_ENDED:
					break;
				default: // unknown case
					result = false;

				}

				return result;
			}
		});
		valueTo.setOnDragListener(new View.OnDragListener() {
			@Override
			public boolean onDrag(View v, DragEvent event) {
				boolean result = true;
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:

					break;
				case DragEvent.ACTION_DRAG_LOCATION:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DROP:
					ClipData.Item item = event.getClipData().getItemAt(0);
					droppedItemTo = item.getText().toString();
					myAnimationOvalTwo();
					oval_two.setText(droppedItemTo);
					myCalculate(valueFrom.getText().toString(), "from");
					break;
				case DragEvent.ACTION_DRAG_ENDED:
					break;
				default: // unknown case
					result = false;

				}

				return result;
			}
		});

		choice_one.setOnDragListener(new View.OnDragListener() {
			@Override
			public boolean onDrag(View v, DragEvent event) {
				boolean result = true;
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:

					break;
				case DragEvent.ACTION_DRAG_LOCATION:
					myAnimationInfoChoiceOne();

					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DROP:
					ClipData.Item item = event.getClipData().getItemAt(0);
					droppedItemFrom = item.getText().toString();
					myAnimationOvalOne();
					oval_one.setText(droppedItemFrom);
					myCalculate(valueFrom.getText().toString(), "from");
					break;
				case DragEvent.ACTION_DRAG_ENDED:
					myAnimationInfoChoiceOneFinish();
					break;
				default: // unknown case
					result = false;

				}

				return result;
			}
		});

		choice_two.setOnDragListener(new View.OnDragListener() {
			@Override
			public boolean onDrag(View v, DragEvent event) {
				boolean result = true;
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DRAG_LOCATION:
					myAnimationInfoChoiceTwo();
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DROP:
					ClipData.Item item = event.getClipData().getItemAt(0);
					droppedItemTo = item.getText().toString();
					myAnimationOvalTwo();
					oval_two.setText(droppedItemTo);
					myCalculate(valueFrom.getText().toString(), "from");
					break;
				case DragEvent.ACTION_DRAG_ENDED:
					myAnimationInfoChoiceTwoFinish();
					break;
				default: // unknown case
					result = false;

				}

				return result;
			}
		});

		return v;
	}

	// ------------------------------------------------------- start to Main
	// calculate
	public void myCalculate(String userValue, String Des) {
		Datasize newCal = new Datasize();
		double enteredValue = 0;
		String tempText = "";
		String convertToNormal = userValue;

		if (userValue.equalsIgnoreCase("")||userValue==null){
			valueFrom.setText("0");
			convertToNormal="0";
		}
		enteredValue = Double.parseDouble(convertToNormal.replaceAll(
				",", "."));

		try {
			if (Des.equalsIgnoreCase("from")) {
				tempText = (newCal.Datasize(droppedItemFrom, droppedItemTo,
						enteredValue));

				valueTo.setText(userFormat(tempText));
				
			} else {
				tempText = (newCal.Datasize(droppedItemTo, droppedItemFrom,
						enteredValue));
				valueFrom.setText(userFormat(tempText));

			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	// ------------------------------------------------------- end calculate
	private static class MyDragShadowBuilder extends View.DragShadowBuilder {
		private static Drawable shadow;

		public MyDragShadowBuilder(View v) {

			super(v);
			shadow = new ColorDrawable(Color.parseColor("#383e3e"));

		}

		@Override
		public void onProvideShadowMetrics(Point size, Point touch) {
			int width = getView().getWidth();
			int height = getView().getHeight();

			shadow.setBounds(0, 0, width, height);
			size.set(width, height);
			touch.set(width / 2, height / 2);
		}

		@Override
		public void onDrawShadow(Canvas canvas) {

			shadow.draw(canvas);
			super.onDrawShadow(canvas);

		}

	}

	public void start(String canvas) {

	}

	// --------------------------- set animation to oval
	public void myAnimationOvalOne() {
		AlphaAnimation animation = new AlphaAnimation(0.8f, 0.0f);
		animation.setDuration(1000);
		oval_one.startAnimation(animation);
		oval_one.setVisibility(View.VISIBLE);
	}

	public void myAnimationOvalTwo() {
		AlphaAnimation animation = new AlphaAnimation(0.8f, 0.0f);
		animation.setDuration(1000);
		oval_two.startAnimation(animation);
		oval_two.setVisibility(View.VISIBLE);
	}


	public void swapAnimation() {

		TranslateAnimation animation = new TranslateAnimation(100.0f, 0.0f,
				0.0f, 0.0f);
		animation.setDuration(2000);
		oval_one.startAnimation(animation);
		oval_two.startAnimation(animation);

	}

	// -------------------------------------------------------
	// Animation for highlight section D&D
	// -------------------------------------------------------

	// for choice one section
	public void myAnimationInfoChoiceOne() {

		GradientDrawable gd = new GradientDrawable(Orientation.BOTTOM_TOP,
				new int[] { Color.TRANSPARENT, Color.TRANSPARENT });
		gd.setStroke(5, Color.parseColor("#ffffff"));
		gd.setCornerRadius(4.1f);
		choice_one.setBackground(gd);
		AlphaAnimation animation = new AlphaAnimation(1.0f, 0.0f);
		animation.setFillAfter(true);
		animation.setDuration(3000);
		choice_one.startAnimation(animation);

	}

	public void myAnimationInfoChoiceOneFinish() {

		int color = Color.TRANSPARENT;
		AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
		animation.setFillAfter(true);
		animation.setDuration(2000);
		choice_one.startAnimation(animation);
		choice_one.setBackgroundColor(color);
	}

	// for choice two
	public void myAnimationInfoChoiceTwo() {

		GradientDrawable gd = new GradientDrawable(Orientation.BOTTOM_TOP,
				new int[] { Color.TRANSPARENT, Color.TRANSPARENT });
		gd.setStroke(5, Color.parseColor("#ffffff"));
		gd.setCornerRadius(4.1f);
		choice_two.setBackground(gd);
		AlphaAnimation animation = new AlphaAnimation(1.0f, 0.0f);
		animation.setFillAfter(true);
		animation.setDuration(3000);
		choice_two.startAnimation(animation);

	}

	public void myAnimationInfoChoiceTwoFinish() {

		int color = Color.TRANSPARENT;
		AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
		animation.setFillAfter(true);
		animation.setDuration(2000);
		choice_two.startAnimation(animation);
		choice_two.setBackgroundColor(color);
	}

	public String userFormat(String finalFormat) {
		String customFormat = getProgramPrefs.getString("userFormat", "##.##");
		String customeSepration = getProgramPrefs.getString("userSepration",".");
		String BigFormat = (customFormat+"E0");
		String result = "";
		try {
			df = new DecimalFormat(customFormat);
			double Output = Double.valueOf(finalFormat);
			if (Output>100000 ){
				df=new DecimalFormat(BigFormat);
			}
			result = (df.format(Output));
			if (customeSepration.equals(",")) {
				result = result.replaceAll("\\.", ",");
			}
		} catch (NumberFormatException nfe) {
		}
		return result;
	}

	public String formatToDot(String reFormat) {
		String customeSepration = getProgramPrefs.getString("userSepration",
				".");
		String reformat = reFormat;
		if (customeSepration.equals(",")) {
			reformat = reFormat.replaceAll("\\.", ",");
		}
		return reformat;

	}

}
