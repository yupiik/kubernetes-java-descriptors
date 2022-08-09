package io.yupiik.kubernetes.bindings.v1_9_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_9_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_9_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_9_10.Validable;
import io.yupiik.kubernetes.bindings.v1_9_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PriorityClass implements Validable<PriorityClass>, Exportable {
    private String apiVersion;
    private String description;
    private Boolean globalDefault;
    private String kind;
    private ObjectMeta metadata;
    private int value;

    public PriorityClass() {
        // no-op
    }

    public PriorityClass(final String apiVersion,
                         final String description,
                         final Boolean globalDefault,
                         final String kind,
                         final ObjectMeta metadata,
                         final int value) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Boolean getGlobalDefault() {
        return globalDefault;
    }

    public void setGlobalDefault(final Boolean globalDefault) {
        this.globalDefault = globalDefault;
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

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                description,
                globalDefault,
                kind,
                metadata,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PriorityClass)) {
            return false;
        }
        final PriorityClass __otherCasted = (PriorityClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(description, __otherCasted.description) &&
            Objects.equals(globalDefault, __otherCasted.globalDefault) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(value, __otherCasted.value);
    }

    public PriorityClass apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PriorityClass description(final String description) {
        this.description = description;
        return this;
    }

    public PriorityClass globalDefault(final Boolean globalDefault) {
        this.globalDefault = globalDefault;
        return this;
    }

    public PriorityClass kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PriorityClass metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PriorityClass value(final int value) {
        this.value = value;
        return this;
    }

    @Override
    public PriorityClass validate() {
        if (kind == null) {
            kind = "PriorityClass";
        }
        if (apiVersion == null) {
            apiVersion = "scheduling.k8s.io/v1alpha1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (description != null ? "\"description\":\"" +  JsonStrings.escapeJson(description) + "\"" : ""),
                    (globalDefault != null ? "\"globalDefault\":" + globalDefault : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    "\"value\":" + value)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
