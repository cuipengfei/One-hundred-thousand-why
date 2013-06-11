import android.net.wifi.WifiManager;

public class TryToHideSomeAPI {
    public void tryAp(){
        WifiManager wifiManager = null;
        //wifiManager.setWifiApEnabled(null, true);

        //上面代码不能编译(如果去掉注释)
        //因为我们引用的存在于SDK中的android.jar里面是没有这个API的。真机上运行时是有这个API的。
        //实际上android.jar只是一个stub包。反编译的话，看起来是这样的：

        //public void acquire() { throw new RuntimeException("Stub!"); }
        //public void release() { throw new RuntimeException("Stub!"); }
        //public void setReferenceCounted(boolean refCounted) { throw new RuntimeException("Stub!"); }
        //public boolean isHeld() { throw new RuntimeException("Stub!"); }
        //public String toString() { throw new RuntimeException("Stub!"); }
        //protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }

        //里面所有的方法都是如此，其存在的意义就是让代码编的过
    }
}
