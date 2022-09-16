package app.w8r.Common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\"\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0012\u0010\'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J-\u0010*\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0,2\u0006\u0010-\u001a\u00020.H\u0016\u00a2\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u0016H\u0014J\b\u00101\u001a\u00020\u0016H\u0014J\b\u00102\u001a\u00020\u0016H\u0016J\u0018\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016J\b\u00106\u001a\u00020\u0016H\u0016J\b\u00107\u001a\u00020\u0016H\u0016J\b\u00108\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u00a8\u00069"}, d2 = {"Lapp/w8r/Common/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "callback", "Llocationprovider/davidserrano/com/LocationProvider$LocationCallback;", "getCallback", "()Llocationprovider/davidserrano/com/LocationProvider$LocationCallback;", "setCallback", "(Llocationprovider/davidserrano/com/LocationProvider$LocationCallback;)V", "dp", "", "getDp", "()F", "setDp", "(F)V", "imageUri", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "setImageUri", "(Landroid/net/Uri;)V", "location", "", "getLocation", "()Lkotlin/Unit;", "askForPermission", "getPhoto", "path", "", "getRealPathFromURI", "contentUri", "hideNavigationBar", "hideStatusBar", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStop", "openCameraGallery", "setLocation", "lat", "lng", "showStatusBar", "takePhotoFromCamera", "transparentStatusBar", "app_debug"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private float dp = 0.0F;
    public android.net.Uri imageUri;
    @org.jetbrains.annotations.NotNull()
    private locationprovider.davidserrano.com.LocationProvider.LocationCallback callback;
    
    public BaseActivity() {
        super();
    }
    
    public float getDp() {
        return 0.0F;
    }
    
    public void setDp(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getImageUri() {
        return null;
    }
    
    public final void setImageUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void hideNavigationBar() {
    }
    
    public void transparentStatusBar() {
    }
    
    public void showStatusBar() {
    }
    
    public void hideStatusBar() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public void openCameraGallery() {
    }
    
    public void takePhotoFromCamera() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getRealPathFromURI(@org.jetbrains.annotations.Nullable()
    android.net.Uri contentUri) {
        return null;
    }
    
    public void getPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public final void askForPermission() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final locationprovider.davidserrano.com.LocationProvider.LocationCallback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    locationprovider.davidserrano.com.LocationProvider.LocationCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Unit getLocation() {
        return null;
    }
    
    public void setLocation(float lat, float lng) {
    }
}