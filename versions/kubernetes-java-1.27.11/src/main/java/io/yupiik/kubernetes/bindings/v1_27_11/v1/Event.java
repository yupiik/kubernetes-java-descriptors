package io.yupiik.kubernetes.bindings.v1_27_11.v1;

import io.yupiik.kubernetes.bindings.v1_27_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_11.Validable;
import io.yupiik.kubernetes.bindings.v1_27_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Event implements Validable<Event>, Exportable {
    private String action;
    private String apiVersion;
    private Integer deprecatedCount;
    private String deprecatedFirstTimestamp;
    private String deprecatedLastTimestamp;
    private EventSource deprecatedSource;
    private String eventTime;
    private String kind;
    private ObjectMeta metadata;
    private String note;
    private String reason;
    private ObjectReference regarding;
    private ObjectReference related;
    private String reportingController;
    private String reportingInstance;
    private EventSeries series;
    private String type;

    public Event() {
        // no-op
    }

    public Event(final String action,
                 final String apiVersion,
                 final Integer deprecatedCount,
                 final String deprecatedFirstTimestamp,
                 final String deprecatedLastTimestamp,
                 final EventSource deprecatedSource,
                 final String eventTime,
                 final String kind,
                 final ObjectMeta metadata,
                 final String note,
                 final String reason,
                 final ObjectReference regarding,
                 final ObjectReference related,
                 final String reportingController,
                 final String reportingInstance,
                 final EventSeries series,
                 final String type) {
        this.action = action;
        this.apiVersion = apiVersion;
        this.deprecatedCount = deprecatedCount;
        this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
        this.deprecatedLastTimestamp = deprecatedLastTimestamp;
        this.deprecatedSource = deprecatedSource;
        this.eventTime = eventTime;
        this.kind = kind;
        this.metadata = metadata;
        this.note = note;
        this.reason = reason;
        this.regarding = regarding;
        this.related = related;
        this.reportingController = reportingController;
        this.reportingInstance = reportingInstance;
        this.series = series;
        this.type = type;
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

    public EventSource getDeprecatedSource() {
        return deprecatedSource;
    }

    public void setDeprecatedSource(final EventSource deprecatedSource) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public ObjectReference getRegarding() {
        return regarding;
    }

    public void setRegarding(final ObjectReference regarding) {
        this.regarding = regarding;
    }

    public ObjectReference getRelated() {
        return related;
    }

    public void setRelated(final ObjectReference related) {
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

    public EventSeries getSeries() {
        return series;
    }

    public void setSeries(final EventSeries series) {
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
        if (!(__other instanceof Event)) {
            return false;
        }
        final Event __otherCasted = (Event) __other;
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

    public Event action(final String action) {
        this.action = action;
        return this;
    }

    public Event apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Event deprecatedCount(final Integer deprecatedCount) {
        this.deprecatedCount = deprecatedCount;
        return this;
    }

    public Event deprecatedFirstTimestamp(final String deprecatedFirstTimestamp) {
        this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
        return this;
    }

    public Event deprecatedLastTimestamp(final String deprecatedLastTimestamp) {
        this.deprecatedLastTimestamp = deprecatedLastTimestamp;
        return this;
    }

    public Event deprecatedSource(final EventSource deprecatedSource) {
        this.deprecatedSource = deprecatedSource;
        return this;
    }

    public Event eventTime(final String eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    public Event kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Event metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Event note(final String note) {
        this.note = note;
        return this;
    }

    public Event reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public Event regarding(final ObjectReference regarding) {
        this.regarding = regarding;
        return this;
    }

    public Event related(final ObjectReference related) {
        this.related = related;
        return this;
    }

    public Event reportingController(final String reportingController) {
        this.reportingController = reportingController;
        return this;
    }

    public Event reportingInstance(final String reportingInstance) {
        this.reportingInstance = reportingInstance;
        return this;
    }

    public Event series(final EventSeries series) {
        this.series = series;
        return this;
    }

    public Event type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public Event validate() {
        if (kind == null) {
            kind = "Event";
        }
        if (apiVersion == null) {
            apiVersion = "events.k8s.io/v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (eventTime == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "eventTime", "eventTime",
                "Missing 'eventTime' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (action != null ? "\"action\":\"" +  JsonStrings.escapeJson(action) + "\"" : ""),
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (deprecatedCount != null ? "\"deprecatedCount\":" + deprecatedCount : ""),
                    (deprecatedFirstTimestamp != null ? "\"deprecatedFirstTimestamp\":\"" +  JsonStrings.escapeJson(deprecatedFirstTimestamp) + "\"" : ""),
                    (deprecatedLastTimestamp != null ? "\"deprecatedLastTimestamp\":\"" +  JsonStrings.escapeJson(deprecatedLastTimestamp) + "\"" : ""),
                    (deprecatedSource != null ? "\"deprecatedSource\":" + deprecatedSource.asJson() : ""),
                    (eventTime != null ? "\"eventTime\":\"" +  JsonStrings.escapeJson(eventTime) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (note != null ? "\"note\":\"" +  JsonStrings.escapeJson(note) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (regarding != null ? "\"regarding\":" + regarding.asJson() : ""),
                    (related != null ? "\"related\":" + related.asJson() : ""),
                    (reportingController != null ? "\"reportingController\":\"" +  JsonStrings.escapeJson(reportingController) + "\"" : ""),
                    (reportingInstance != null ? "\"reportingInstance\":\"" +  JsonStrings.escapeJson(reportingInstance) + "\"" : ""),
                    (series != null ? "\"series\":" + series.asJson() : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
