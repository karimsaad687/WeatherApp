package com.app.weather.DashBoard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/app/weather/DashBoard/GetWeatherController;", "Lapp/w8r/Common/BaseModel;", "()V", "activity", "Lapp/w8r/Common/BaseActivity;", "getActivity", "()Lapp/w8r/Common/BaseActivity;", "setActivity", "(Lapp/w8r/Common/BaseActivity;)V", "linkedList_", "Landroidx/lifecycle/MutableLiveData;", "Lcom/app/weather/DashBoard/WeatherModel;", "getLinkedList_", "()Landroidx/lifecycle/MutableLiveData;", "setLinkedList_", "(Landroidx/lifecycle/MutableLiveData;)V", "Failed", "", "error", "Lcom/androidnetworking/error/ANError;", "Start", "data", "", "getLinkedList", "successObject", "object", "Lorg/json/JSONObject;", "app_debug"})
public final class GetWeatherController extends app.w8r.Common.BaseModel {
    @org.jetbrains.annotations.Nullable()
    private app.w8r.Common.BaseActivity activity;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.app.weather.DashBoard.WeatherModel> linkedList_;
    
    public GetWeatherController() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.w8r.Common.BaseActivity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.Nullable()
    app.w8r.Common.BaseActivity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.app.weather.DashBoard.WeatherModel> getLinkedList_() {
        return null;
    }
    
    public final void setLinkedList_(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.app.weather.DashBoard.WeatherModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<com.app.weather.DashBoard.WeatherModel> getLinkedList() {
        return null;
    }
    
    @java.lang.Override()
    public void Start(@org.jetbrains.annotations.NotNull()
    app.w8r.Common.BaseActivity activity, @org.jetbrains.annotations.Nullable()
    java.lang.Object data) {
    }
    
    @java.lang.Override()
    public void successObject(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject object) {
    }
    
    @java.lang.Override()
    public void Failed(@org.jetbrains.annotations.NotNull()
    com.androidnetworking.error.ANError error) {
    }
}