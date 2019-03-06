# Navigation

Android Studio 3.2及以上

build.gradle 导入Navigation
```
dependencies {
    //...
    implementation "android.arch.navigation:navigation-fragment-ktx:1.0.0-rc02"
    implementation "android.arch.navigation:navigation-ui-ktx:1.0.0-rc02"
}

```


fragment布局

```
<fragment
            android:id="@+id/fragment"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:name="androidx.navigation.fragment.NavHostFragment"
            android:layout_weight="1"
            app:defaultNavHost="true"
            app:navGraph="@navigation/navigation_main"/>
```

fragment会发现有2分属性：
app:navGraph: 属性赋值的是 nagation 文件
app:defaultNavHost: 这个是和返回键相关的，true点击返回上个界面，false点击退出
