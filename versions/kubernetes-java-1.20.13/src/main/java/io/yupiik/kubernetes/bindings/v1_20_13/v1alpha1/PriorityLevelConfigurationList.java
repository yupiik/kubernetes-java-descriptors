package io.yupiik.kubernetes.bindings.v1_20_13.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_20_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_13.Validable;
import io.yupiik.kubernetes.bindings.v1_20_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PriorityLevelConfigurationList implements Validable<PriorityLevelConfigurationList>, Exportable {
    private String apiVersion;
    private List<PriorityLevelConfiguration> items;
    private String kind;
    private ListMeta metadata;

    public PriorityLevelConfigurationList() {
        // no-op
    }

    public PriorityLevelConfigurationList(final String apiVersion,
                                          final List<PriorityLevelConfiguration> items,
                                          final String kind,
                                          final ListMeta metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<PriorityLevelConfiguration> getItems() {
        return items;
    }

    public void setItems(final List<PriorityLevelConfiguration> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ListMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ListMeta metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PriorityLevelConfigurationList)) {
            return false;
        }
        final PriorityLevelConfigurationList __otherCasted = (PriorityLevelConfigurationList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public PriorityLevelConfigurationList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PriorityLevelConfigurationList items(final List<PriorityLevelConfiguration> items) {
        this.items = items;
        return this;
    }

    public PriorityLevelConfigurationList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PriorityLevelConfigurationList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public PriorityLevelConfigurationList validate() {
        if (kind == null) {
            kind = "PriorityLevelConfigurationList";
        }
        if (apiVersion == null) {
            apiVersion = "flowcontrol.apiserver.k8s.io/v1alpha1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (items == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "items", "items",
                "Missing 'items' attribute.", true));
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
                    (items != null ? "\"items\":" + items.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
