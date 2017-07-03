package library3.library3.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by San on 2016/11/28.
 */
//缓存软件一些参数和数据
public class CacheUtils {

    public static void putBoolean(Context context, String key, boolean value) {

        SharedPreferences sp = context.getSharedPreferences("san3", Context.MODE_PRIVATE);

        sp.edit().putBoolean(key,value).commit();
    }
    public static Boolean getBoolean(Context context, String key) {

        SharedPreferences sp = context.getSharedPreferences("san3",Context.MODE_PRIVATE);

        return  sp.getBoolean(key,false);
    }





    //在本地缓存或者在sd卡缓存
    public static void putString(Context context, String key, String value) {

//        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
//            //保存在/mmt/sdcard/news/http:/...
//            try {
//                String fileName = MD5Encoder.encode(key);
//                //本地地址注意“  + ”  “  ， ”
//                File file = new File(Environment.getExternalStorageDirectory() + "/news3/file",fileName);
//               // LogUtil.e("文本-----数据--------路径-----" + file);
//
//                File parentFile = file.getParentFile();
//                if (!parentFile.exists()){
//                    parentFile.mkdirs();
//                }
//                if (!file.exists()){
//                    file.createNewFile();
//                }
//                //保存文本数据
//                FileOutputStream fileOutputStream = new FileOutputStream(file);
//                fileOutputStream.write(value.getBytes());
//                fileOutputStream.close();
//               // LogUtil.e("文本-----数据--------缓存成功" + fileOutputStream);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//        }else{

        SharedPreferences sp = context.getSharedPreferences("xiaomi", Context.MODE_PRIVATE);

        sp.edit().putString(key,value).commit();

//        }

    }


    //在本地获取或者在sd卡获取
    public static String getString(Context context, String key) {


//        String result="";
//        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
//            //保存在/mmt/sdcard/news/http:/...
//            try {
//
//                String fileName = MD5Encoder.encode(key);
//                File file = new File(Environment.getExternalStorageDirectory() + "/news3/file", fileName);
//           //     LogUtil.e("文本-----数据--------路径-----" + file);
//                if (file.exists()) {
//
//                    FileInputStream is = new FileInputStream(file);
//                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
//                    byte[] buffer = new byte[1024];
//                    int lenght;
//                    while ((lenght = is.read(buffer)) != -1) {
//
//                        stream.write(buffer, 0, lenght);
//
//                    }
//
//                    is.close();
//                    stream.close();
//                    result = stream.toString();
//                  //  LogUtil.e("文本-----数据--------获取成功" + result);
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//        } else {

            SharedPreferences sp = context.getSharedPreferences("xiaomi", Context.MODE_PRIVATE);

            return   sp.getString(key, "");

//        }
//        return result;
    }
}
