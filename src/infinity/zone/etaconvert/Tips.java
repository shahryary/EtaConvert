package infinity.zone.etaconvert;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.IconPagerAdapter;
import com.viewpagerindicator.PageIndicator;

public class Tips extends SherlockFragmentActivity {


	TestFragmentAdapter mAdapter;
	ViewPager mPager;
	PageIndicator mIndicator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		getSupportActionBar().hide();
		getSupportActionBar().setDisplayShowTitleEnabled(false);
		getSupportActionBar().setDisplayShowHomeEnabled(false);
		setContentView(R.layout.indicator);

		mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

		mPager = (ViewPager) findViewById(R.id.pager);
		mPager.setAdapter(mAdapter);

		mIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
		mIndicator.setViewPager(mPager);
		((CirclePageIndicator) mIndicator).setSnap(true);
		mIndicator
				.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						Toast.makeText(Tips.this,
								"Changed to page " + position,
								Toast.LENGTH_SHORT).show();
					}

					@Override
					public void onPageScrolled(int position,
							float positionOffset, int positionOffsetPixels) {
					}

					@Override
					public void onPageScrollStateChanged(int state) {
					}
				});
	}

	public class TestFragmentAdapter extends FragmentPagerAdapter implements
			IconPagerAdapter {
		// private int mCount = TAB_TITLES.length;
		private int[] Images = new int[] { R.drawable.mob,
				R.drawable.mob2, R.drawable.mob3,
				R.drawable.ic_density

		};
		protected final int[] ICONS = new int[] { R.drawable.ic_force,
				R.drawable.ic_force, R.drawable.ic_force, R.drawable.ic_force };

		private int mCount = Images.length;

		public TestFragmentAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			return new PlaceSlideFragment(Images[position]);
		}

		@Override
		public int getCount() {
			return mCount;
		}

		/*
		 * public CharSequence getPageTitle(int position) { return
		 * TAB_TITLES[position]; }
		 */

		@Override
		public int getIconResId(int index) {
			// TODO Auto-generated method stub
			return ICONS[index % ICONS.length];
		}

		public void setCount(int count) {
			if (count > 0 && count <= 10) {
				mCount = count;
				notifyDataSetChanged();
			}
		}
	}

}