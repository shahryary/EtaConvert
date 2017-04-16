package infinity.zone.convertors;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ShareApps extends PreferenceActivity{
	@Override
	  protected void onCreate(Bundle savedInstanceState) {
	        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
	        emailIntent.setType("text/plain"); 
	        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"shahryary@gmail.com"});
	        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "I wanna add this unit :");
	        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Add units !"); 
	        startActivity(emailIntent);  
	        super.onCreate(savedInstanceState);
	        finish();

	    }
}
