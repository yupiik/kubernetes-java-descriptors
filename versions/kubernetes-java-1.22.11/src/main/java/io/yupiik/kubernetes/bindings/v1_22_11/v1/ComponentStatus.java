package io.yupiik.kubernetes.bindings.v1_22_11.v1;

import io.yupiik.kubernetes.bindings.v1_22_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_11.Validable;
import io.yupiik.kubernetes.bindings.v1_22_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ComponentStatus implements Validable<ComponentStatus>, Exportable {
    private String apiVersion;
    private List<ComponentCondition> conditions;
    private String kind;
    private ObjectMeta metadata;

    public ComponentStatus() {
        // no-op
    }

    public ComponentStatus(final String apiVersion,
                           final List<ComponentCondition> conditions,
                           final String kind,
                           final ObjectMeta metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ComponentCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<ComponentCondition> conditions) {
        this.conditions = conditions;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                conditions,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ComponentStatus)) {
            return false;
        }
        final ComponentStatus __otherCasted = (ComponentStatus) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public ComponentStatus apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ComponentStatus conditions(final List<ComponentCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ComponentStatus kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ComponentStatus metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public ComponentStatus validate() {
        if (kind == null) {
            kind = "ComponentStatus";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
