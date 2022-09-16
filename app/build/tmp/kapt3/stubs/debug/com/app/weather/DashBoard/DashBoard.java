package com.app.weather.DashBoard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J*\u0010E\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u00172\u0006\u0010I\u001a\u00020\u0017H\u0016J\u0006\u0010J\u001a\u00020BJ\u0010\u0010K\u001a\u00020B2\u0006\u0010L\u001a\u00020$H\u0016J\u000e\u0010M\u001a\u00020B2\u0006\u0010N\u001a\u000201J\u0012\u0010O\u001a\u00020B2\b\u0010P\u001a\u0004\u0018\u00010QH\u0014J*\u0010R\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u0017H\u0016J\u000e\u0010T\u001a\u00020B2\u0006\u0010U\u001a\u00020$J\u0018\u0010V\u001a\u00020B2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020XH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020+X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u00a8\u0006Z"}, d2 = {"Lcom/app/weather/DashBoard/DashBoard;", "Lapp/w8r/Common/BaseActivity;", "Landroid/text/TextWatcher;", "()V", "adapter", "Lcom/app/weather/DashBoard/History/HistoryAdapter;", "getAdapter", "()Lcom/app/weather/DashBoard/History/HistoryAdapter;", "setAdapter", "(Lcom/app/weather/DashBoard/History/HistoryAdapter;)V", "appDataBase", "Lcom/app/weather/Room/WeatherDataBase;", "getAppDataBase", "()Lcom/app/weather/Room/WeatherDataBase;", "setAppDataBase", "(Lcom/app/weather/Room/WeatherDataBase;)V", "binding", "Lcom/app/weather/databinding/ActivityDashBoardBinding;", "getBinding", "()Lcom/app/weather/databinding/ActivityDashBoardBinding;", "setBinding", "(Lcom/app/weather/databinding/ActivityDashBoardBinding;)V", "conditionIcon", "", "getConditionIcon", "()I", "setConditionIcon", "(I)V", "historyModels", "", "Lcom/app/weather/DashBoard/History/HistoryModel;", "getHistoryModels", "()Ljava/util/List;", "setHistoryModels", "(Ljava/util/List;)V", "imagePath", "", "getImagePath", "()Ljava/lang/String;", "setImagePath", "(Ljava/lang/String;)V", "observer", "Landroidx/lifecycle/Observer;", "Lcom/app/weather/DashBoard/WeatherModel;", "getObserver", "()Landroidx/lifecycle/Observer;", "setObserver", "(Landroidx/lifecycle/Observer;)V", "open", "", "getOpen", "()Z", "setOpen", "(Z)V", "weatherController", "Lcom/app/weather/DashBoard/GetWeatherController;", "getWeatherController", "()Lcom/app/weather/DashBoard/GetWeatherController;", "setWeatherController", "(Lcom/app/weather/DashBoard/GetWeatherController;)V", "weatherModel", "getWeatherModel", "()Lcom/app/weather/DashBoard/WeatherModel;", "setWeatherModel", "(Lcom/app/weather/DashBoard/WeatherModel;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "clearUI", "getPhoto", "path", "loadHistory", "shake", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTextChanged", "before", "openDialog", "image", "setLocation", "lat", "", "lng", "app_debug"})
public final class DashBoard extends app.w8r.Common.BaseActivity implements android.text.TextWatcher {
    public com.app.weather.databinding.ActivityDashBoardBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.app.weather.DashBoard.GetWeatherController weatherController;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.Observer<com.app.weather.DashBoard.WeatherModel> observer;
    public com.app.weather.Room.WeatherDataBase appDataBase;
    public com.app.weather.DashBoard.WeatherModel weatherModel;
    public java.util.List<com.app.weather.DashBoard.History.HistoryModel> historyModels;
    public com.app.weather.DashBoard.History.HistoryAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imagePath = "";
    private int conditionIcon = 0;
    private boolean open = true;
    
    public DashBoard() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.weather.databinding.ActivityDashBoardBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.app.weather.databinding.ActivityDashBoardBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.weather.DashBoard.GetWeatherController getWeatherController() {
        return null;
    }
    
    public final void setWeatherController(@org.jetbrains.annotations.Nullable()
    com.app.weather.DashBoard.GetWeatherController p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.Observer<com.app.weather.DashBoard.WeatherModel> getObserver() {
        return null;
    }
    
    public final void setObserver(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.Observer<com.app.weather.DashBoard.WeatherModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.weather.Room.WeatherDataBase getAppDataBase() {
        return null;
    }
    
    public final void setAppDataBase(@org.jetbrains.annotations.NotNull()
    com.app.weather.Room.WeatherDataBase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.weather.DashBoard.WeatherModel getWeatherModel() {
        return null;
    }
    
    public final void setWeatherModel(@org.jetbrains.annotations.NotNull()
    com.app.weather.DashBoard.WeatherModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.weather.DashBoard.History.HistoryModel> getHistoryModels() {
        return null;
    }
    
    public final void setHistoryModels(@org.jetbrains.annotations.NotNull()
    java.util.List<com.app.weather.DashBoard.History.HistoryModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.weather.DashBoard.History.HistoryAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.app.weather.DashBoard.History.HistoryAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImagePath() {
        return null;
    }
    
    public final void setImagePath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getConditionIcon() {
        return 0;
    }
    
    public final void setConditionIcon(int p0) {
    }
    
    public final boolean getOpen() {
        return false;
    }
    
    public final void setOpen(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void loadHistory(boolean shake) {
    }
    
    @java.lang.Override()
    public void getPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    @java.lang.Override()
    public void setLocation(float lat, float lng) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
    
    public final void openDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String image) {
    }
    
    public final void clearUI() {
    }
}