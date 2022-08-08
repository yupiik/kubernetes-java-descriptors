package io.yupiik.kubernetes.bindings.v1_14_9.v1;

import java.util.Objects;

public class EventListItems {
    private String action;
    private String apiVersion;
    private Integer count;
    private String eventTime;
    private String firstTimestamp;
    private EventListItemsInvolvedObject involvedObject;
    private String kind;
    private String lastTimestamp;
    private String message;
    private EventListItemsMetadata metadata;
    private String reason;
    private EventListItemsRelated related;
    private String reportingComponent;
    private String reportingInstance;
    private EventListItemsSeries series;
    private EventListItemsSource source;
    private String type;

    public EventListItems() {
        // no-op
    }

    public EventListItems(final String action,
                          final String apiVersion,
                          final Integer count,
                          final String eventTime,
                          final String firstTimestamp,
                          final EventListItemsInvolvedObject involvedObject,
                          final String kind,
                          final String lastTimestamp,
                          final String message,
                          final EventListItemsMetadata metadata,
                          final String reason,
                          final EventListItemsRelated related,
                          final String reportingComponent,
                          final String reportingInstance,
                          final EventListItemsSeries series,
                          final EventListItemsSource source,
                          final String type) {
        // no-op
    }

    public String getAction() {
        return action;
    }

    public void setAction(final String action) {
        this.action = action;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(final String eventTime) {
        this.eventTime = eventTime;
    }

    public String getFirstTimestamp() {
        return firstTimestamp;
    }

    public void setFirstTimestamp(final String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
    }

    public EventListItemsInvolvedObject getInvolvedObject() {
        return involvedObject;
    }

    public void setInvolvedObject(final EventListItemsInvolvedObject involvedObject) {
        this.involvedObject = involvedObject;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getLastTimestamp() {
        return lastTimestamp;
    }

    public void setLastTimestamp(final String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public EventListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final EventListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public EventListItemsRelated getRelated() {
        return related;
    }

    public void setRelated(final EventListItemsRelated related) {
        this.related = related;
    }

    public String getReportingComponent() {
        return reportingComponent;
    }

    public void setReportingComponent(final String reportingComponent) {
        this.reportingComponent = reportingComponent;
    }

    public String getReportingInstance() {
        return reportingInstance;
    }

    public void setReportingInstance(final String reportingInstance) {
        this.reportingInstance = reportingInstance;
    }

    public EventListItemsSeries getSeries() {
        return series;
    }

    public void setSeries(final EventListItemsSeries series) {
        this.series = series;
    }

    public EventListItemsSource getSource() {
        return source;
    }

    public void setSource(final EventListItemsSource source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                apiVersion,
                count,
                eventTime,
                firstTimestamp,
                involvedObject,
                kind,
                lastTimestamp,
                message,
                metadata,
                reason,
                related,
                reportingComponent,
                reportingInstance,
                series,
                source,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EventListItems)) {
            return false;
        }
        final EventListItems __otherCasted = (EventListItems) __other;
        return Objects.equals(action, __otherCasted.action) &&
            Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(count, __otherCasted.count) &&
            Objects.equals(eventTime, __otherCasted.eventTime) &&
            Objects.equals(firstTimestamp, __otherCasted.firstTimestamp) &&
            Objects.equals(involvedObject, __otherCasted.involvedObject) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(lastTimestamp, __otherCasted.lastTimestamp) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(related, __otherCasted.related) &&
            Objects.equals(reportingComponent, __otherCasted.reportingComponent) &&
            Objects.equals(reportingInstance, __otherCasted.reportingInstance) &&
            Objects.equals(series, __otherCasted.series) &&
            Objects.equals(source, __otherCasted.source) &&
            Objects.equals(type, __otherCasted.type);
    }
}
