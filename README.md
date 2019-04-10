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


### 布局布局

```
<fragment
            android:id="@+id/fragment"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:name="androidx.navigation.fragment.NavHostFragment"
            android:layout_weight="1"
            app:defaultNavHost="true"
            app:navGraph="@navigation/navigation_main"/>
            
            
<android.support.design.widget.BottomNavigationView
            android:id="@+id/navigation_view"
            style="@style/Widget.MaterialComponents.NavigationView"
            android:layout_width="match_parent"
            android:layout_height="55dp"
            android:layout_gravity="start"
            android:background="#ffffff"
            app:labelVisibilityMode="labeled"
            app:menu="@menu/menu_main"/>
```

fragment会发现有2分属性：
app:navGraph: 属性赋值的是 nagation 文件
app:defaultNavHost: 这个是和返回键相关的，true点击返回上个界面，false点击退出


### 注
menu的各个item的id与navigation的各个id要相同
