package io.yupiik.kubernetes.bindings.v1_17_13.v1beta1;

import java.util.Objects;

public class EventListItems {
    private String action;
    private String apiVersion;
    private Integer deprecatedCount;
    private String deprecatedFirstTimestamp;
    private String deprecatedLastTimestamp;
    private EventListItemsDeprecatedSource deprecatedSource;
    private String eventTime;
    private String kind;
    private EventListItemsMetadata metadata;
    private String note;
    private String reason;
    private EventListItemsRegarding regarding;
    private EventListItemsRelated related;
    private String reportingController;
    private String reportingInstance;
    private EventListItemsSeries series;
    private String type;

    public EventListItems() {
        // no-op
    }

    public EventListItems(final String action,
                          final String apiVersion,
                          final Integer deprecatedCount,
                          final String deprecatedFirstTimestamp,
                          final String deprecatedLastTimestamp,
                          final EventListItemsDeprecatedSource deprecatedSource,
                          final String eventTime,
                          final String kind,
                          final EventListItemsMetadata metadata,
                          final String note,
                          final String reason,
                          final EventListItemsRegarding regarding,
                          final EventListItemsRelated related,
                          final String reportingController,
                          final String reportingInstance,
                          final EventListItemsSeries series,
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

    public Integer getDeprecatedCount() {
        return deprecatedCount;
    }

    public void setDeprecatedCount(final Integer deprecatedCount) {
        this.deprecatedCount = deprecatedCount;
    }

    public String getDeprecatedFirstTimestamp() {
        return deprecatedFirstTimestamp;
    }

    public void setDeprecatedFirstTimestamp(final String deprecatedFirstTimestamp) {
        this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
    }

    public String getDeprecatedLastTimestamp() {
        return deprecatedLastTimestamp;
    }

    public void setDeprecatedLastTimestamp(final String deprecatedLastTimestamp) {
        this.deprecatedLastTimestamp = deprecatedLastTimestamp;
    }

    public EventListItemsDeprecatedSource getDeprecatedSource() {
        return deprecatedSource;
    }

    public void setDeprecatedSource(final EventListItemsDeprecatedSource deprecatedSource) {
        this.deprecatedSource = deprecatedSource;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(final String eventTime) {
        this.eventTime = eventTime;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public EventListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final EventListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public String getNote() {
        return note;
    }

    public void setNote(final String note) {
        this.note = note;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public EventListItemsRegarding getRegarding() {
        return regarding;
    }

    public void setRegarding(final EventListItemsRegarding regarding) {
        this.regarding = regarding;
    }

    public EventListItemsRelated getRelated() {
        return related;
    }

    public void setRelated(final EventListItemsRelated related) {
        this.related = related;
    }

    public String getReportingController() {
        return reportingController;
    }

    public void setReportingController(final String reportingController) {
        this.reportingController = reportingController;
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
                deprecatedCount,
                deprecatedFirstTimestamp,
                deprecatedLastTimestamp,
                deprecatedSource,
                eventTime,
                kind,
                metadata,
                note,
                reason,
                regarding,
                related,
                reportingController,
                reportingInstance,
                series,
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
            Objects.equals(deprecatedCount, __otherCasted.deprecatedCount) &&
            Objects.equals(deprecatedFirstTimestamp, __otherCasted.deprecatedFirstTimestamp) &&
            Objects.equals(deprecatedLastTimestamp, __otherCasted.deprecatedLastTimestamp) &&
            Objects.equals(deprecatedSource, __otherCasted.deprecatedSource) &&
            Objects.equals(eventTime, __otherCasted.eventTime) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(note, __otherCasted.note) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(regarding, __otherCasted.regarding) &&
            Objects.equals(related, __otherCasted.related) &&
            Objects.equals(reportingController, __otherCasted.reportingController) &&
            Objects.equals(reportingInstance, __otherCasted.reportingInstance) &&
            Objects.equals(series, __otherCasted.series) &&
            Objects.equals(type, __otherCasted.type);
    }
}
