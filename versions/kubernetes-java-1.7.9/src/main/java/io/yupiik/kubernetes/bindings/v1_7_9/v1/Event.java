package io.yupiik.kubernetes.bindings.v1_7_9.v1;

import java.util.Objects;

public class Event {
    private String apiVersion;
    private Integer count;
    private String firstTimestamp;
    private EventInvolvedObject involvedObject;
    private String kind;
    private String lastTimestamp;
    private String message;
    private EventMetadata metadata;
    private String reason;
    private EventSource source;
    private String type;

    public Event() {
        // no-op
    }

    public Event(final String apiVersion,
                 final Integer count,
                 final String firstTimestamp,
                 final EventInvolvedObject involvedObject,
                 final String kind,
                 final String lastTimestamp,
                 final String message,
                 final EventMetadata metadata,
                 final String reason,
                 final EventSource source,
                 final String type) {
        // no-op
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

    public String getFirstTimestamp() {
        return firstTimestamp;
    }

    public void setFirstTimestamp(final String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
    }

    public EventInvolvedObject getInvolvedObject() {
        return involvedObject;
    }

    public void setInvolvedObject(final EventInvolvedObject involvedObject) {
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

    public EventMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final EventMetadata metadata) {
        this.metadata = metadata;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public EventSource getSource() {
        return source;
    }

    public void setSource(final EventSource source) {
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
                apiVersion,
                count,
                firstTimestamp,
                involvedObject,
                kind,
                lastTimestamp,
                message,
                metadata,
                reason,
                source,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Event)) {
            return false;
        }
        final Event __otherCasted = (Event) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(count, __otherCasted.count) &&
            Objects.equals(firstTimestamp, __otherCasted.firstTimestamp) &&
            Objects.equals(involvedObject, __otherCasted.involvedObject) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(lastTimestamp, __otherCasted.lastTimestamp) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(source, __otherCasted.source) &&
            Objects.equals(type, __otherCasted.type);
    }
}
