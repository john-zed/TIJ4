package innerclasses;

/**
 * Author   : Victor Chong
 * Date     : 2019/1/9 15:47
 * Brief    : 如何在任意的作用域内嵌入一个内部类
 */
public class Parcel6 {
    private void internalTracking(boolean b){
        if(b){
            //注意，虽然该类在作用域内，但并非说该类的创建是有条件的，实际上它和其他类一起编译过了
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
        //在此处不可用，因为在作用域之外
        //TrackSlip ts = new TrackingSlip("x");
    }

    public void track(){
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}