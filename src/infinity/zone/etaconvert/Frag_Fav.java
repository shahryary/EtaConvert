package infinity.zone.etaconvert;

import infinity.zone.convertors.Fav;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.SearchManager;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.speech.RecognizerIntent;

public class Frag_Fav extends Fragment implements OnItemClickListener,
		OnClickListener {

	private static final int VOICE_RECOGNITION_REQUEST_CODE = 1001;
	private ListView mlvTextMatches;

	String[] main_arr;
	String[] arr;
	String language;
	ArrayAdapter<String> arrAdapt;
	ArrayList<String> lv_arr;
	ArrayList<String> textMatchList;

	AutoCompleteTextView autoComplete;
	TextView cat;
	TextView Text3;
	TextView Text5;
	View v;
	LinearLayout wrapper;
	SharedPreferences getProgramPrefs;

	Fav checkResult = new Fav();

	Fragment newFragment;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		wrapper = new LinearLayout(getActivity());
		setRetainInstance(true);
		v = inflater.inflate(R.layout.frag_fav, wrapper, true);
		getProgramPrefs = PreferenceManager
				.getDefaultSharedPreferences(getActivity());
		language = getProgramPrefs.getString("language", "en");
		setHasOptionsMenu(true);
		autoComplete = (AutoCompleteTextView) wrapper
				.findViewById(R.id.autoCompleteMain);
		final Drawable x = getResources().getDrawable(R.drawable.voicesearch);
		x.setBounds(0, 0, x.getIntrinsicWidth(), x.getIntrinsicHeight());

		autoComplete.setOnTouchListener(new OnTouchListener() {

			public boolean onTouch(View v, MotionEvent event) {
				if (autoComplete.getCompoundDrawables()[2] == null) {
					return false;
				}
				if (event.getAction() != MotionEvent.ACTION_UP) {
					return false;
				}
				if (event.getX() > autoComplete.getWidth()
						- autoComplete.getPaddingRight()
						- x.getIntrinsicWidth()) {
					autoComplete.setText("");
					onClickSearch(v);
				}
				return false;
			}

		});

		cat = (TextView) wrapper.findViewById(R.id.categuary);
		Text3=(TextView) wrapper.findViewById(R.id.textView3);
		Text5=(TextView) wrapper.findViewById(R.id.textView5);
		mlvTextMatches = (ListView) wrapper.findViewById(R.id.lvTextMatches);
		// array list & set Adaptor
		main_arr = getResources().getStringArray(R.array.ALLMain_list);
		lv_arr = new ArrayList<String>(main_arr.length);
		for (String myArray : main_arr) {
			lv_arr.add(myArray);
		}
		arr = lv_arr.toArray(new String[lv_arr.size()]);
		arrAdapt = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, arr);
		autoComplete.setAdapter(arrAdapt);
		arrAdapt.setNotifyOnChange(true);
		autoComplete.setOnItemClickListener(this);
		// ------------------
		Text3.setVisibility(4);
		Text5.requestFocus();
		cat.setVisibility(4);
		mlvTextMatches.setVisibility(4);
		// ------------------------------------------------------------------------
		// ------------------------------------------------------------------------
		// change Fragment to selected Unit *****

		checkVoiceRecognition();
		// ---------------
		// -------------------------
		mlvTextMatches.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> l, View v, int position,
					long id) {
				ClipData.Item item = new ClipData.Item(textMatchList
						.get(position));
				autoComplete.setText(item.getText().toString());
				String temp = checkResult.fav(item.getText().toString());

				cat.setText(setAction(Integer.valueOf(temp)));
				return;
			}

		});
		return v;

	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position,
			long id) {
		String str = (String) arrAdapt.getItem(position);
		Toast.makeText(getActivity().getApplicationContext(), str,
				Toast.LENGTH_SHORT).show();
		// ------------------------
		cat.setVisibility(1);
		mlvTextMatches.setVisibility(4);
		// cat.setText(checkResult.fav(str, language));
		String temp = checkResult.fav(str);
		cat.setText(setAction(Integer.valueOf(temp)));
	}

	public void checkVoiceRecognition() {
		PackageManager pm = getActivity().getPackageManager();
		List<ResolveInfo> activities = pm.queryIntentActivities(new Intent(
				RecognizerIntent.ACTION_RECOGNIZE_SPEECH), 0);
		if (activities.size() == 0) {
			Toast.makeText(getActivity().getApplicationContext(),

			"Voice recognizer not present",

			Toast.LENGTH_SHORT).show();

		}

	}

	public void onClick(View v) {

		switch (v.getId()) {

		

		}

	}

	public void onClickSearch(View v) {
		Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
		intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getClass()
				.getPackage().getName());
		intent.putExtra(RecognizerIntent.EXTRA_PROMPT, autoComplete.getText()
				.toString());
		intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
				RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH);
		if (autoComplete.getId() == AdapterView.INVALID_POSITION) {
			Toast.makeText(getActivity().getApplicationContext(),

			"Please select No. of Matches from spinner",

			Toast.LENGTH_SHORT).show();
			return;
		}

		startActivityForResult(intent, VOICE_RECOGNITION_REQUEST_CODE);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {

		if (requestCode == VOICE_RECOGNITION_REQUEST_CODE)
			if (resultCode == getActivity().RESULT_OK) {
				textMatchList = data
						.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
				if (!textMatchList.isEmpty()) {
					if (textMatchList.get(0).contains("search")) {

						String searchQuery = textMatchList.get(0);

						searchQuery = searchQuery.replace("search", "");

						Intent search = new Intent(Intent.ACTION_WEB_SEARCH);

						search.putExtra(SearchManager.QUERY, searchQuery);

						startActivity(search);

					} else {
						Text3.setVisibility(1);
						mlvTextMatches.setAdapter(new ArrayAdapter<String>(
								getActivity(),
								android.R.layout.simple_list_item_1,
								textMatchList));
						cat.setVisibility(1);
						mlvTextMatches.setVisibility(1);

					}

				}

				// Result code for various error.

			} else if (resultCode == RecognizerIntent.RESULT_AUDIO_ERROR) {

				showToastMessage("Audio Error");

			} else if (resultCode == RecognizerIntent.RESULT_CLIENT_ERROR) {

				showToastMessage("Client Error");

			} else if (resultCode == RecognizerIntent.RESULT_NETWORK_ERROR) {

				showToastMessage("Network Error");

			} else if (resultCode == RecognizerIntent.RESULT_NO_MATCH) {

				showToastMessage("No Match");

			} else if (resultCode == RecognizerIntent.RESULT_SERVER_ERROR) {

				showToastMessage("Server Error");

			}

		super.onActivityResult(requestCode, resultCode, data);

	}

	void showToastMessage(String message) {

		Toast.makeText(getActivity().getApplicationContext(), message,

		Toast.LENGTH_SHORT).show();

	}

	// ---------------compare & set action witch is menu selected
	public String setAction(int code) {
		FragmentManager fm = getFragmentManager();
		String result = null;
		switch (code) {
		case 0:
			result = "Sorry , we could't find this unit in our database !";
			return result;
		case 1:
			result = "Acceleration / Linear";
			newFragment = new Frag_AccelerationLinear();
			break;
		case 2:
			result = "Angels";
			newFragment = new Frag_Angel();
			break;
		case 3:
			result = "Area";
			newFragment = new Frag_Area();
			break;
		case 4:
			result = "Currency";
			newFragment = new Frag_Currency();
			break;
		case 5:
			result = "Data Size";
			newFragment = new Frag_Datasize();
			break;
		case 6:
			result = "Data Transfer Rate";
			newFragment = new Frag_DataTransferRate();
			break;
		case 7:
			result = "Density";
			newFragment = new Frag_Density();
			break;
		case 8:
			result = "Distance/Length";
			newFragment = new Frag_DistanceLength();
			break;
		case 9:
			result = "Energy and Work";
			newFragment = new Frag_EnergyWork();
			break;
		case 10:
			result = "Force";
			newFragment = new Frag_Force();
			break;
		case 11:
			result = "Power/Capacity";
			newFragment = new Frag_PowerCapacity();
			break;
		case 12:
			result = "Pressure";
			newFragment = new Frag_Pressure();
			break;
		case 13:
			result = "Speed";
			newFragment = new Frag_Speed();
			break;
		case 14:
			result = "Temperature";
			newFragment = new Frag_Temperature();
			break;
		case 15:
			result = "Time";
			newFragment = new Frag_Time();
			break;
		case 16:
			result = "Volume";
			newFragment = new Frag_Volume();
			break;
		case 17:
			result = "Weight";
			newFragment = new Frag_Weight();
			break;
		}
		fm.beginTransaction().replace(R.id.content_frame, newFragment).commit();
		return result;
	}

}
