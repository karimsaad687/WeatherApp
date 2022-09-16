package app.w8r.Common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000fJ\u0010\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eJ\u0010\u0010\'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)J/\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020!0.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0.\u00a2\u0006\u0002\u00100J.\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020,2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000fJ\u0012\u00105\u001a\u0004\u0018\u00010!2\b\u00106\u001a\u0004\u0018\u00010!\u00a8\u00067"}, d2 = {"Lapp/w8r/Common/MyUtils;", "", "()V", "animateAlpha", "", "view", "Landroid/view/View;", "valueTo", "", "duration", "", "delay", "animateColor", "Landroid/widget/ImageView;", "colorTo", "", "animateHeight", "animateRotation", "animateScale", "animateTranslateY", "animateTranslateYDownUp", "animateWidth", "bitmapToFile", "Ljava/io/File;", "bitmap", "Landroid/graphics/Bitmap;", "activity", "Landroid/app/Activity;", "cancelNotification", "ctx", "Landroid/content/Context;", "notifyId", "getMonthString", "", "index", "imageToBase64", "isOnline", "", "context", "isValidEmail", "target", "", "multiTextColor", "textview", "Landroid/widget/TextView;", "words", "", "colors", "(Landroid/widget/TextView;[Ljava/lang/String;[Ljava/lang/Integer;)V", "word1", "word2", "color1", "color2", "toISoFormat", "date", "app_debug"})
public final class MyUtils {
    @org.jetbrains.annotations.NotNull()
    public static final app.w8r.Common.MyUtils INSTANCE = null;
    
    private MyUtils() {
        super();
    }
    
    public final void multiTextColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textview, @org.jetbrains.annotations.NotNull()
    java.lang.String word1, @org.jetbrains.annotations.NotNull()
    java.lang.String word2, int color1, int color2) {
    }
    
    public final void multiTextColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textview, @org.jetbrains.annotations.NotNull()
    java.lang.String[] words, @org.jetbrains.annotations.NotNull()
    java.lang.Integer[] colors) {
    }
    
    public final void animateHeight(@org.jetbrains.annotations.NotNull()
    android.view.View view, float valueTo) {
    }
    
    public final void animateRotation(@org.jetbrains.annotations.NotNull()
    android.view.View view, float valueTo) {
    }
    
    public final void animateWidth(@org.jetbrains.annotations.NotNull()
    android.view.View view, float valueTo) {
    }
    
    public final void animateTranslateY(@org.jetbrains.annotations.NotNull()
    android.view.View view, float valueTo) {
    }
    
    public final void animateTranslateYDownUp(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void animateColor(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, int colorTo) {
    }
    
    public final void animateAlpha(@org.jetbrains.annotations.NotNull()
    android.view.View view, float valueTo) {
    }
    
    public final void animateAlpha(@org.jetbrains.annotations.NotNull()
    android.view.View view, float valueTo, long duration, long delay) {
    }
    
    public final void animateScale(@org.jetbrains.annotations.NotNull()
    android.view.View view, float valueTo, long duration, long delay) {
    }
    
    public final boolean isValidEmail(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence target) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String imageToBase64(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File bitmapToFile(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String toISoFormat(@org.jetbrains.annotations.Nullable()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMonthString(int index) {
        return null;
    }
    
    public final void cancelNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, int notifyId) {
    }
    
    public final boolean isOnline(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}