# MarqueeView
跑马灯,支持上下两个方向滚动

####特点:
只创建两个TextView.之前有在githup上看到过跑马灯的实现,差不多都是会随着数据的多少而创建多少TextView.个人觉得这种方式不是很优雅.所以就有了这个库.
####效果图:
![](https://github.com/hjmJhon/MarqueeView/raw/master/ScreenShots/screen.gif)

####使用:直接把lib拷进你的project添加依赖即可
in your layout:

```
<com.example.marqueeview.MarqueeView
        android:id="@+id/marqueeView"
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:layout_marginLeft="20dp"
        android:layout_marginRight="20dp"
        android:layout_marginTop="20dp"
        android:background="@drawable/spahe_text_bg_gra"
        app:flipOrientation="topToBottom"/>


    <com.example.marqueeview.MarqueeView
        android:id="@+id/marqueeView2"
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:layout_marginLeft="20dp"
        android:layout_marginRight="20dp"
        android:layout_marginTop="20dp"
        android:background="@drawable/spahe_text_bg_gra"
        app:flipOrientation="bottomToTop"
        app:textColor="@color/colorPrimaryDark"
        app:textGravity="CENTER"
        app:textSize="20sp"/>
```

setData:

```
mMarqueeView.setData(data);
mMarqueeView2.setData(data);

```
tip:调用setData(List<String> data)方法后会自动调用start方法开始滚动.

切换滚动状态:

```
mMarqueeView.toggleFlip();

```

停止:

```
mMarqueeView2.stop();
```

####属性:
|      attribute      |       meaning       |
| :--------------: | :-----------------: |
|  textColor     |     文字颜色       |
|  textSize      |      文字大小      |
|  textGravity   |      文字对齐方式   |
|  internal      |      滚动的间隔时间  |
|  flipDuration  |      滚动动画执行的时长|
|  flipOrientation|     滚动的方向       |

###有任何问题请联系我(email:hjm0908hjm@163.com),欢迎issue,pr!
