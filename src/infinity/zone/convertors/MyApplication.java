package infinity.zone.convertors;

import infinity.zone.etaconvert.R;
import android.app.Application;
import org.acra.*;
import org.acra.annotation.*;

@ReportsCrashes(formUri = "http://www.bugsense.com/api/acra?api_key=a81b1e97", formKey = "",

mode = ReportingInteractionMode.TOAST,
resToastText = R.string.crash_toast_text,
forceCloseDialogAfterToast = false 


)
public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		ACRA.init(this);

	}

}
