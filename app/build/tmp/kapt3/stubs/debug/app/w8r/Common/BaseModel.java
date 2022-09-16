package app.w8r.Common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J(\u00102\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u00010\u00192\u0016\u00104\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001905J\u001a\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0006\u0010:\u001a\u00020/J(\u0010;\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u00010\u00192\u0016\u00104\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001905J(\u0010<\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u00010\u00192\u0016\u00104\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001905J\u0006\u0010=\u001a\u00020/J\u0018\u0010>\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u00010\u00192\u0006\u0010?\u001a\u00020\u001fJ\u0010\u0010@\u001a\u00020/2\b\u0010A\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010B\u001a\u00020/2\u0006\u0010A\u001a\u00020\u001fH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001f\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0018\u00010%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u001f\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020)\u0018\u00010%\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\'R\u001c\u0010+\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001d\u00a8\u0006C"}, d2 = {"Lapp/w8r/Common/BaseModel;", "Landroidx/lifecycle/ViewModel;", "()V", "baseActivity", "Lapp/w8r/Common/BaseActivity;", "getBaseActivity", "()Lapp/w8r/Common/BaseActivity;", "setBaseActivity", "(Lapp/w8r/Common/BaseActivity;)V", "ffmpegLoading", "Lcom/app/weather/Common/Loading;", "getFfmpegLoading", "()Lcom/app/weather/Common/Loading;", "setFfmpegLoading", "(Lcom/app/weather/Common/Loading;)V", "isRunning", "", "()Z", "setRunning", "(Z)V", "loading_dialog", "Landroid/app/Dialog;", "getLoading_dialog", "()Landroid/app/Dialog;", "method", "", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "oldObject", "Lorg/json/JSONObject;", "getOldObject", "()Lorg/json/JSONObject;", "setOldObject", "(Lorg/json/JSONObject;)V", "oldParams", "", "getOldParams", "()Ljava/util/Map;", "oldParamsFiles", "Ljava/io/File;", "getOldParamsFiles", "oldUrl", "getOldUrl", "setOldUrl", "Failed", "", "error", "Lcom/androidnetworking/error/ANError;", "Get", "url", "map", "", "Start", "activity", "data", "", "closeLoading", "getWithoutLoading", "getWithoutToken", "openLoading", "postJson", "jsonObject", "successArray", "object", "successObject", "app_debug"})
public class BaseModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private app.w8r.Common.BaseActivity baseActivity;
    @org.jetbrains.annotations.Nullable()
    private final android.app.Dialog loading_dialog = null;
    @org.jetbrains.annotations.Nullable()
    private com.app.weather.Common.Loading ffmpegLoading;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String oldUrl;
    @org.jetbrains.annotations.Nullable()
    private org.json.JSONObject oldObject;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.String> oldParams = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.io.File> oldParamsFiles = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String method = "";
    private boolean isRunning = false;
    
    public BaseModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.w8r.Common.BaseActivity getBaseActivity() {
        return null;
    }
    
    public final void setBaseActivity(@org.jetbrains.annotations.Nullable()
    app.w8r.Common.BaseActivity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getLoading_dialog() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.weather.Common.Loading getFfmpegLoading() {
        return null;
    }
    
    public final void setFfmpegLoading(@org.jetbrains.annotations.Nullable()
    com.app.weather.Common.Loading p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOldUrl() {
        return null;
    }
    
    public final void setOldUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.json.JSONObject getOldObject() {
        return null;
    }
    
    public final void setOldObject(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getOldParams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.io.File> getOldParamsFiles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMethod() {
        return null;
    }
    
    public final void setMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isRunning() {
        return false;
    }
    
    public final void setRunning(boolean p0) {
    }
    
    public final void openLoading() {
    }
    
    public final void closeLoading() {
    }
    
    public final void Get(@org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> map) {
    }
    
    public final void getWithoutToken(@org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> map) {
    }
    
    public final void getWithoutLoading(@org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> map) {
    }
    
    public final void postJson(@org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject) {
    }
    
    public void successObject(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject object) {
    }
    
    public final void successArray(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject object) {
    }
    
    public void Failed(@org.jetbrains.annotations.NotNull()
    com.androidnetworking.error.ANError error) {
    }
    
    public void Start(@org.jetbrains.annotations.NotNull()
    app.w8r.Common.BaseActivity activity, @org.jetbrains.annotations.Nullable()
    java.lang.Object data) {
    }
}