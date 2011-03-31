package h264.com;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

public class H264Android extends Activity {

	VView vv;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vv = new VView(this);
        setContentView(vv);
    }
    
    // Menu item Ids
    public static final int PLAY_ID = Menu.FIRST;    
    public static final int EXIT_ID = Menu.FIRST + 1; 

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        
        menu.add(0, PLAY_ID, 0, R.string.play);   
        menu.add(0, EXIT_ID, 1, R.string.exit);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {        
	        case PLAY_ID:
	        {
	          // �˴��趨��ͬ�ֱ��ʵ������ļ�
	          
	        	String file = "/sdcard/352x288.264"; //352x288.264"; //240x320.264"; 
	        	vv.PlayVideo(file);
	        	
	            return true;
	        }
	        case EXIT_ID:
	        {
	        	finish();
	            return true;
	        }
        }
        return super.onOptionsItemSelected(item);
    }
}