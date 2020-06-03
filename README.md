# 锤子手机系统自动收集数据 ![Android CI](https://github.com/valbendan/SmartisanDemo/workflows/Android%20CI/badge.svg)


会检测有没有密码
```text
2020-05-28 16:39:32.266 28429-28429/com.smartisan.demo I/cr.WebContentsSmartisan: TPassword: checkHasPasswordElement === 1 hasPasswordElement=false
```

访问的网址, 网页标题, 访问时间
```text
2020-05-28 16:43:10.699 28429-28429/com.smartisan.demo I/SmartisanDataReportEngine: reportNavigationInfo: 1590655171097|1590655390699|219602||https://dabaichi.hackernav.com/|欢迎来到大白痴的博客 — 大白痴的博客 0.0.1 文档
```
1590655171097 -> unix time: 2020/5/28 16:39:31:097
219602 传输文件大小 ???


上报手机状态给头条
```text
2020-05-28 16:39:30.806 28429-28457/com.smartisan.demo W/System.err: java.lang.SecurityException: getDeviceId: Neither user 10174 nor current process has android.permission.READ_PHONE_STATE.
2020-05-28 16:39:30.806 28429-28457/com.smartisan.demo W/System.err:     at android.os.Parcel.readException(Parcel.java:1702)
2020-05-28 16:39:30.807 28429-28457/com.smartisan.demo W/System.err:     at android.os.Parcel.readException(Parcel.java:1655)
2020-05-28 16:39:30.807 28429-28457/com.smartisan.demo W/System.err:     at com.android.internal.telephony.ITelephony$Stub$Proxy.getDeviceId(ITelephony.java:4825)
2020-05-28 16:39:30.807 28429-28457/com.smartisan.demo W/System.err:     at android.telephony.TelephonyManager.getDeviceId(TelephonyManager.java:857)
2020-05-28 16:39:30.807 28429-28457/com.smartisan.demo W/System.err:     at org.chromium.base.smartisan.DeviceInfo.getImei(DeviceInfo.java:102)
2020-05-28 16:39:30.807 28429-28457/com.smartisan.demo W/System.err:     at org.chromium.base.smartisan.DeviceInfo.<init>(DeviceInfo.java:66)
2020-05-28 16:39:30.807 28429-28457/com.smartisan.demo W/System.err:     at org.chromium.android_webview.smartisan.data_report.Toutiao$1.run(Toutiao.java:41)
2020-05-28 16:39:30.807 28429-28457/com.smartisan.demo W/System.err:     at java.lang.Thread.run(Thread.java:761)
```


上传 Wi-Fi 状态给头条
```text
2020-05-28 16:39:30.810 28429-28457/com.smartisan.demo W/System.err: java.lang.SecurityException: WifiService: Neither user 10174 nor current process has android.permission.ACCESS_WIFI_STATE.
2020-05-28 16:39:30.810 28429-28429/com.smartisan.demo I/cr_BrowserStartup: Initializing chromium process, singleProcess=true
2020-05-28 16:39:30.810 28429-28457/com.smartisan.demo W/System.err:     at android.os.Parcel.readException(Parcel.java:1702)
2020-05-28 16:39:30.810 28429-28457/com.smartisan.demo W/System.err:     at android.os.Parcel.readException(Parcel.java:1655)
2020-05-28 16:39:30.810 28429-28457/com.smartisan.demo W/System.err:     at android.net.wifi.IWifiManager$Stub$Proxy.getConnectionInfo(IWifiManager.java:1183)
2020-05-28 16:39:30.810 28429-28457/com.smartisan.demo W/System.err:     at android.net.wifi.WifiManager.getConnectionInfo(WifiManager.java:1339)
2020-05-28 16:39:30.810 28429-28457/com.smartisan.demo W/System.err:     at org.chromium.base.smartisan.DeviceInfo.getMac(DeviceInfo.java:125)
2020-05-28 16:39:30.810 28429-28457/com.smartisan.demo W/System.err:     at org.chromium.base.smartisan.DeviceInfo.<init>(DeviceInfo.java:78)
2020-05-28 16:39:30.810 28429-28457/com.smartisan.demo W/System.err:     at org.chromium.android_webview.smartisan.data_report.Toutiao$1.run(Toutiao.java:41)
2020-05-28 16:39:30.810 28429-28457/com.smartisan.demo W/System.err:     at java.lang.Thread.run(Thread.java:761)
```
