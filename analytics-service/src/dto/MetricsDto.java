package com.northtech.analytics.dto;

public class MetricsDto {
    private String metricName;
    private double value;

    public MetricsDto() {}

    public MetricsDto(String metricName, double value) {
        this.metricName = metricName;
        this.value = value;
    }

    public String getMetricName() { return metricName; }
    public void setMetricName(String metricName) { this.metricName = metricName; }
    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }
}
