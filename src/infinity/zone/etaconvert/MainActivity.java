package infinity.zone.etaconvert;

import java.util.Locale;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.viewpagerindicator.PageIndicator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends SherlockFragmentActivity {

	/* Language default value setting */
	private static final int RESULT_SETTINGS = 1;
	private static final int Tips = 2;

	public final static int THEME_HOLO_LIGHT = 1;
	public final static int THEME_BLACK = 2;
	int position;
	Locale myLocale;
	String myPosiotionOnback;
	// array for icon for using in sidebar menu
	Integer[] mIcons = { R.drawable.ic_home,
			R.drawable.ic_acceleration, R.drawable.ic_angels,
			R.drawable.ic_area, R.drawable.ic_currency, R.drawable.ic_datasize,
			R.drawable.ic_datatransferrate, R.drawable.ic_density,
			R.drawable.ic_distance, R.drawable.ic_energy, R.drawable.ic_force,
			R.drawable.ic_power, R.drawable.ic_pressure, R.drawable.ic_speed,
			R.drawable.ic_temperature, R.drawable.ic_time,
			R.drawable.ic_volume, R.drawable.ic_weigth };
	// ----------------------
	ViewPager mPager;
	PageIndicator mIndicator;
	Fragment newFragment;
	FragmentManager fm;
	/* Main Fragment section */
	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	private CharSequence mDrawerTitle;
	private CharSequence mTitle;
	private String[] mFragmentTitles;
	ListView mainLeftlist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		/* setting theme */

		/* start content view after setting theme */
		showUserSettingsOnStart(); // read SharedPreferences to set Default
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mainLeftlist = (ListView) findViewById(R.id.drawer_list);
		mPager = (ViewPager) findViewById(R.id.pager);
		mTitle = mDrawerTitle = getTitle();
		mFragmentTitles = getResources().getStringArray(R.array.fragments);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
		mDrawerList = (ListView) findViewById(R.id.drawer_list);
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);
		// setting custome icon & text
		mDrawerList.setAdapter(new MyCustomAdapter(this,
				R.layout.drawer_list_item, mFragmentTitles));
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {
			public void onDrawerClosed(View v) {
				getSupportActionBar().setTitle(mTitle);
				supportInvalidateOptionsMenu();
			}

			public void onDrawerOpened(View v) {
				getSupportActionBar().setTitle(mDrawerTitle);
				supportInvalidateOptionsMenu();
			}
		};
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		if (savedInstanceState == null) {
			selectItem(0);
		}

	}

	@Override
	public void onBackPressed() {
/*		Toast.makeText(getApplicationContext(), myPosiotionOnback,
				Toast.LENGTH_LONG).show();
*/
		if (myPosiotionOnback.equalsIgnoreCase("home")) {
			super.onBackPressed();
		} else {
			newFragment = new Frag_Fav();
			fm.beginTransaction().replace(R.id.content_frame, newFragment)
					.commit();
			mDrawerList.setItemChecked(position, true);
			myPosiotionOnback = mFragmentTitles[0];
			setTitle(mFragmentTitles[0]);
		}

	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
		menu.findItem(R.id.Tips).setVisible(!drawerOpen);
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getSupportMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			if (mDrawerLayout.isDrawerOpen(mDrawerList)) {
				mDrawerLayout.closeDrawer(mDrawerList);
			} else {
				mDrawerLayout.openDrawer(mDrawerList);
			}
			return true;
		case R.id.Tips:
			Intent has = new Intent(MainActivity.this, Tips.class);
			startActivityForResult(has, Tips);
			return true;

		case R.id.setting:

			Intent is = new Intent(MainActivity.this, SettingsActivity.class);
			startActivityForResult(is, RESULT_SETTINGS);
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}

	/*
	 * start to setting for language activity /*
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		switch (requestCode) {
		case RESULT_SETTINGS:
			showUserSettings();
			break;
		case Tips:

			break;

		}

	}

	public void showUserSettings() {
		SharedPreferences sharedPrefs = PreferenceManager
				.getDefaultSharedPreferences(this);

		setLocale(sharedPrefs.getString("prefSyncFrequency", "en"));
		setTextSize(sharedPrefs.getString("txt_list", "1"));
		upThem(sharedPrefs.getString("theme_list", "1"));

		Editor editor = sharedPrefs.edit();
		editor.putString("userFormat",
				sharedPrefs.getString("example_list", "2"));
		editor.putString("userSepration",
				sharedPrefs.getString("groupseprate_list", "1"));
		editor.putString("language",
				sharedPrefs.getString("prefSyncFrequency", "en"));
		editor.putString("theme", sharedPrefs.getString("theme_list", "1"));

		editor.commit();

	}

	/* set Text Size - read from menu activity */
	private void setTextSize(String size) {
		Resources res = getResources();
		float pixel = 0;
		pixel = Float.valueOf(size);
		DisplayMetrics dm = res.getDisplayMetrics();
		Configuration conf = res.getConfiguration();
		conf.fontScale = pixel;
		res.updateConfiguration(conf, dm);

	}

	public void setLocale(String lang) {

		myLocale = new Locale(lang);
		Resources res = getResources();
		DisplayMetrics dm = res.getDisplayMetrics();
		Configuration conf = res.getConfiguration();
		conf.locale = myLocale;
		res.updateConfiguration(conf, dm);

	}

	public void upThem(String theme) {

		int position = Integer.valueOf(theme);
		Intent intent = new Intent(this, MainActivity.class);
		intent.putExtra("position", position);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

		finish();
		startActivity(intent);

	}

	public void changeThem(String pos) {
		position = Integer.valueOf(pos);
		switch (position) {
		case THEME_BLACK:
			setTheme(R.style.AppTheme_Dark);
			break;
		case THEME_HOLO_LIGHT:
			setTheme(R.style.AppTheme);
			break;
		default:
		}
	}

	/* end language setting section */
	// -----------------------------------------------------------------------------------------

	public void showUserSettingsOnStart() {
		SharedPreferences sharedPrefs = PreferenceManager
				.getDefaultSharedPreferences(this);

		setLocale(sharedPrefs.getString("prefSyncFrequency", "en"));
		setTextSize(sharedPrefs.getString("txt_list", "1"));
		changeThem(sharedPrefs.getString("theme", "1"));

		Editor editor = sharedPrefs.edit();
		editor.putString("userFormat",
				sharedPrefs.getString("example_list", "2"));
		editor.commit();

	}

	// -----------------------------------------------------------------------------------------
	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			selectItem(position);
		}
	}

	private void selectItem(int position) {
		newFragment = new Frag_Fav();
		fm = getSupportFragmentManager();
		switch (position) {
		case 0:
			newFragment = new Frag_Fav();
			break;
		case 1:
			newFragment = new Frag_AccelerationLinear();
			break;
		case 2:
			newFragment = new Frag_Angel();
			break;
		case 3:
			newFragment = new Frag_Area();
			break;
		case 4:
			newFragment = new Frag_Currency();
			break;
		case 5:
			newFragment = new Frag_Datasize();
			break;
		case 6:
			newFragment = new Frag_DataTransferRate();
			break;
		case 7:
			newFragment = new Frag_Density();
			break;
		case 8:
			newFragment = new Frag_DistanceLength();
			break;
		case 9:
			newFragment = new Frag_EnergyWork();
			break;
		case 10:
			newFragment = new Frag_Force();
			break;
		case 11:
			newFragment = new Frag_PowerCapacity();
			break;
		case 12:
			newFragment = new Frag_Pressure();
			break;
		case 13:
			newFragment = new Frag_Speed();
			break;
		case 14:
			newFragment = new Frag_Temperature();
			break;
		case 15:
			newFragment = new Frag_Time();
			break;
		case 16:
			newFragment = new Frag_Volume();
			break;
		case 17:
			newFragment = new Frag_Weight();
			break;

		}

		fm.beginTransaction().replace(R.id.content_frame, newFragment).commit();
		mDrawerList.setItemChecked(position, true);
		setTitle(mFragmentTitles[position]);
		myPosiotionOnback = mFragmentTitles[position];
		mDrawerLayout.closeDrawer(mDrawerList);

	}

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getSupportActionBar().setTitle(title);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);

		mDrawerToggle.onConfigurationChanged(newConfig);

	}

	/* to set icon with text */
	public class MyCustomAdapter extends ArrayAdapter<String> {
		public MyCustomAdapter(Context context, int textViewResourceId,
				String[] objects) {
			super(context, textViewResourceId, objects);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			LayoutInflater inflater = MainActivity.this.getLayoutInflater();
			View row = inflater.inflate(R.layout.drawer_list_item, parent,
					false);
			TextView item = (TextView) row.findViewById(R.id.mytext);
			item.setText(mFragmentTitles[position]);
			ImageView icon = (ImageView) row.findViewById(R.id.imgListIcon);
			icon.setImageResource(mIcons[position]);
			return row;
		}
	}

}
