package library3.library3;

import android.app.Application;

import org.xutils.x;

import cn.sharesdk.framework.ShareSDK;

/**
 * Created by San on 2017/4/10.
 */
public class LibraryApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.setDebug(true);
        x.Ext.init(this);
        ShareSDK.initSDK(this);

    }
}
