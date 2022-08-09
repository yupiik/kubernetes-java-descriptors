package io.yupiik.kubernetes.bindings.v1_8_5.v1;

import io.yupiik.kubernetes.bindings.v1_8_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_5.Validable;
import io.yupiik.kubernetes.bindings.v1_8_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Event implements Validable<Event>, Exportable {
    private String apiVersion;
    private Integer count;
    private String firstTimestamp;
    private ObjectReference involvedObject;
    private String kind;
    private String lastTimestamp;
    private String message;
    private ObjectMeta metadata;
    private String reason;
    private EventSource source;
    private String type;

    public Event() {
        // no-op
    }

    public Event(final String apiVersion,
                 final Integer count,
                 final String firstTimestamp,
                 final ObjectReference involvedObject,
                 final String kind,
                 final String lastTimestamp,
                 final String message,
                 final ObjectMeta metadata,
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

    public ObjectReference getInvolvedObject() {
        return involvedObject;
    }

    public void setInvolvedObject(final ObjectReference involvedObject) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public Event apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Event count(final Integer count) {
        this.count = count;
        return this;
    }

    public Event firstTimestamp(final String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
        return this;
    }

    public Event involvedObject(final ObjectReference involvedObject) {
        this.involvedObject = involvedObject;
        return this;
    }

    public Event kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Event lastTimestamp(final String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }

    public Event message(final String message) {
        this.message = message;
        return this;
    }

    public Event metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Event reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public Event source(final EventSource source) {
        this.source = source;
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
            apiVersion = "v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (involvedObject == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "involvedObject", "involvedObject",
                "Missing 'involvedObject' attribute.", true));
        }
        if (metadata == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metadata", "metadata",
                "Missing 'metadata' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (count != null ? "\"count\":" + count : ""),
                    (firstTimestamp != null ? "\"firstTimestamp\":\"" +  JsonStrings.escapeJson(firstTimestamp) + "\"" : ""),
                    (involvedObject != null ? "\"involvedObject\":" + involvedObject.asJson() : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (lastTimestamp != null ? "\"lastTimestamp\":\"" +  JsonStrings.escapeJson(lastTimestamp) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (source != null ? "\"source\":" + source.asJson() : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
