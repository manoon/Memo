package our.memo;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

/**
 * Created by yifan on 14-9-3.
 */
public class EditNote extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.edit_notes);
    }

}
