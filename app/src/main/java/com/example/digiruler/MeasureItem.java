package com.example.digiruler;

public class MeasureItem {
    private String title;
    private Class<?> targetActivityClass;

    public MeasureItem(String title, Class<?> targetActivityClass) {
        this.title = title;
        this.targetActivityClass = targetActivityClass;
    }

    public String getTitle() {
        return title;
    }

    public Class<?> getTargetActivityClass() {
        return targetActivityClass;
    }
}
