package yy.chen.mediaplay.viewpager;

import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import yy.chen.mediaplay.base.BasePager;

/**
 * Created by chenrongfa on 2016/12/26
 */

public class AudioPager extends BasePager {
//   Context context;
    private TextView textView;
    @Override
    public View initView() {
        Log.e("erro","音频初始化");
        textView=new TextView(context);
        textView.setTextSize(20);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    @Override
    public void initData() {
        Log.e("erro","AudioPager数据初始化");
        textView.setText("初始化");
    }

    public AudioPager(Context context) {
        super(context);
//        this.context=context;
    }
}
