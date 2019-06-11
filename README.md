# ActivityEnterAnimation2
A simple project show Animations of Activity transations

#### 做Activity转场动画千万不可为了黑屏问题设置 <item name="android:windowIsTranslucent">true</item>，这样设置后在8.0系统切换横竖屏会崩溃。出现黑屏的根源在于转场动画没写对

```
public class BaseAcitivity extends AppCompatActivity {

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        // 进入动画、退出动画，比如 A 打开 B，则A为进入、B为退出，下面的示例是A从右侧进入、B不动
        overridePendingTransition(R.anim.slide_right_in,R.anim.hold);
    }

    @Override
    public void finish() {
        super.finish();
        // 进入动画、退出动画，比如 从B 退到 A，则A为进入、B为退出，下面的示例是A不动、B从右侧退出
        overridePendingTransition(R.anim.hold,R.anim.slide_right_out);
    }
}
```
