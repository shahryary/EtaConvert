package infinity.zone.etaconvert;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;

public final class PlaceSlideFragment extends Fragment {
    int imageResourceId;
    
	public PlaceSlideFragment(int i) {
        imageResourceId = i;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    
    	setRetainInstance(true);
    	Display display = getActivity().getWindowManager().getDefaultDisplay();
    	int width = display.getWidth(); 
        int height = display.getHeight();
        ImageView image = new ImageView(getActivity());
        image.setLayoutParams(new LayoutParams(width, height));  
        
        
        image.setImageResource(imageResourceId);

        LinearLayout layout = new LinearLayout(getActivity());
        layout.setLayoutParams(new LayoutParams(width, height ));

        //layout.setGravity(Gravity.CENTER);
        layout.addView(image);
        
        return layout;
    }
}
